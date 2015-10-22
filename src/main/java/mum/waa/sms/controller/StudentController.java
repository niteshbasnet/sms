package mum.waa.sms.controller;

import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.multipart.MultipartFile;

import mum.waa.sms.model.Course;
import mum.waa.sms.model.Entry;
import mum.waa.sms.model.Student;
import mum.waa.sms.service.CourseService;
import mum.waa.sms.service.StudentService;

/**
 * @author Regan
 *
 */
@Controller
public class StudentController {

	@Autowired
	private ServletContext context;

	@Autowired
	private StudentService studentservice;

	@Autowired
	private CourseService courseservice;

	@RequestMapping(value = { "/addstudentform" }, method = RequestMethod.GET)
	public String addStudentGet(@ModelAttribute("newStudent") Student student) {
		return "addstudentform";
	}

	@RequestMapping(value = { "/addstudentform" }, method = RequestMethod.POST)
	public String addStudentPost(
			@Valid @ModelAttribute("newStudent") Student student,
			BindingResult result, RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			System.out.println("in the result");
			return "addstudentform";
		} else {
			MultipartFile studentImage = student.getStudentImage();
			String rootDirectory = context.getRealPath("/");
			if (studentImage != null && !studentImage.isEmpty()) {
				try {
					System.out.println("addimage try");
					studentImage.transferTo(new File(rootDirectory
							+ "\\resources\\images\\student_image\\"
							+ student.getStudentId() + ".png"));
					student.setStudentImagePath(rootDirectory
							+ "\\resources\\images\\student_image\\"
							+ student.getStudentId() + ".png");
				} catch (Exception e) {
					throw new RuntimeException("Student Image saving failed", e);
				}
			}

			// List<String> allCourses = getCourseforEntry(student.getEntry());
			List<Course> allCourseObj = courseservice.getCoursesByEntry(student
					.getEntry());
			int i = 0;
			List<Course> assignedCourses = new ArrayList<Course>();
			for (i = 0; i < allCourseObj.size(); i++) {
				if (i >= student.getCourses().size()) {
					break;
				}
				// String courseName = allCourses.get(i);
				if (student.getCourses().get(i) != null
						&& "on".equals(student.getCourses().get(i).getName())) {
					// List<Course> course = courseservice
					// .getCoursesByEntry(student.getEntry());

					assignedCourses.add(allCourseObj.get(i));
				}
			}
			student.setCourses(assignedCourses);
			studentservice.saveStudent(student);
			redirectAttributes.addFlashAttribute(student);
			return "redirect:results";
		}
	}

	@RequestMapping(value = "/results", method = RequestMethod.GET)
	public String successMessageAdd(Model model) throws IOException {
		Student student = (Student) (((ModelMap) model).get("student"));

		if (student == null)
			throw new IOException("The student is Obsolete, Try Again!");

		return "showMessage";
	}

	@RequestMapping(value = { "/editstudent" }, method = RequestMethod.GET)
	public String searchStudentGet() {
		return "editstudent";
	}

	@RequestMapping(value = "/editstudent", method = RequestMethod.POST)
	public String searchStudentPost(@RequestParam("search") int searchId,
			Model model) {
		Student student = studentservice.getStudentById(searchId);
		System.out.println(searchId);
		model.addAttribute("searchedStudent", student);
		return "updatestudentform";
	}

	@RequestMapping(value = "/course", method = RequestMethod.GET)
	public @ResponseBody List<String> getCourseforEntry(
			@RequestParam("entry") String entry) {
		System.out.println("dfggfg:::::" + entry);

		Entry entryEnum = Entry.valueOf(entry.toUpperCase());
		List<Course> listcourse = courseservice.getCoursesByEntry(entryEnum);
		List<String> listCourseString = new ArrayList<String>();
		for (int i = 0; i < listcourse.size(); i++) {
			listCourseString.add(listcourse.get(i).getName());
			System.out.println(listcourse.get(i).getName());
		}
		// List<String> listCourseString =
		// listcourse.stream().map(c->c.getName()).collect(Collectors.toList());
		return listCourseString;
	}

	@RequestMapping(value = { "/updatestudentform" }, method = RequestMethod.GET)
	public String updateStudentGet() {
		System.out.println("in the get");
		return "updatestudentform";
	}

	@RequestMapping(value = "/updatestudentform", method = RequestMethod.POST)
	public String updateStudentPost(
			@ModelAttribute("searchedStudent") Student studentupdated,
			Model model) {
		studentservice.updateStudent(studentupdated);
		return "editstudent";
	}

	@ModelAttribute("entry")
	public Set<Entry> getStudentId() {
		Set<Entry> entry = new HashSet<Entry>(Arrays.asList(Entry.values()));
		return entry;
	}
}

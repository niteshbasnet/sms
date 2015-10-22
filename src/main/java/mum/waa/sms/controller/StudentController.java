package mum.waa.sms.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.waa.sms.model.Course;
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
	private StudentService studentservice;

	@Autowired
	private CourseService courseservice;

	@RequestMapping(value = { "/addstudentform" }, method = RequestMethod.GET)
	public String addStudentGet(@ModelAttribute("newStudent") Student student) {
		return "addstudentform";
	}

	@RequestMapping(value = { "/addstudentform" }, method = RequestMethod.POST)
	public String addStudentPost(@Valid @ModelAttribute("newStudent") Student student,
			RedirectAttributes redirectAttributes, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("in the result");
			return "addstudentform";
		} else {
			List<String> allCourses = getCourseforEntry(student.getEntry());
			int i = 0;
			List<Course> assignedCourses = new ArrayList<Course>();
			for (i = 0; i < allCourses.size(); i++) {
				if (i >= student.getCourses().size()) {
					break;
				}
				String courseName = allCourses.get(i);
				if (student.getCourses().get(i) != null && "on".equals(student.getCourses().get(i).getCourseName())) {
					Course course = courseservice.getCourseByName(courseName);
					assignedCourses.add(course);
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
	public String searchStudentPost(@RequestParam("search") int searchId, Model model) {
		Student student = studentservice.getStudentById(searchId);
		System.out.println(searchId);
		model.addAttribute("searchedStudent", student);
		return "updatestudentform";
	}

	@RequestMapping(value = "/course", method = RequestMethod.GET)
	public @ResponseBody List<String> getCourseforEntry(@RequestParam("entry") String entry) {
		System.out.println(entry);
		List<String> listcourse = courseservice.getCourse();
		return listcourse;
	}

	@RequestMapping(value = { "/updatestudentform" }, method = RequestMethod.GET)
	public String updateStudentGet() {
		System.out.println("in the get");
		return "updatestudentform";
	}

	@RequestMapping(value = "/updatestudentform", method = RequestMethod.POST)
	public String updateStudentPost(@ModelAttribute("searchedStudent") Student studentupdated, Model model) {
		studentservice.updateStudent(studentupdated);
		return "editstudent";
	}
}

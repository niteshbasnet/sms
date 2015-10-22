package mum.waa.sms.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
	public String addStudentPost(@Valid @ModelAttribute("newStudent") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "addstudentform";
		}
		
		MultipartFile studentImage = student.getStudentImage();
		String rootDirectory = context.getRealPath("/");
		if (studentImage != null && !studentImage.isEmpty()) {
			try {
				System.out.println("addimage try");
				studentImage.transferTo(new File(rootDirectory
						+ "\\resources\\images\\student_image\\" + student.getStudentId()
						+ ".png"));
				student.setStudentImagePath(rootDirectory+ "\\resources\\images\\student_image\\" + student.getStudentId()+ ".png");
			} catch (Exception e) {
				throw new RuntimeException("Student Image saving failed", e);
			}
		}
		studentservice.saveStudent(student);
		return "addstudentform";
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

package mum.waa.sms.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

	@RequestMapping(value = "/course", method = RequestMethod.GET)
	public @ResponseBody List<String> getCourseforEntry(@RequestParam("entry") String entry) {
		System.out.println(entry);
		List<String> listcourse = courseservice.getCourse();
		// String course = listcourse.get(0);
		return listcourse;
	}

	@RequestMapping(value = { "/addstudentform" }, method = RequestMethod.POST)
	public String addStudentPost(@Valid @ModelAttribute("newStudent") Student student) {
		studentservice.saveStudent(student);
		List<Course> listcourse = student.getCourses();
		for (Course course : listcourse) {
			System.out.println(course.getCourseName());
		}

		return "addstudent";
	}

}

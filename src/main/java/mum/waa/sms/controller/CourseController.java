package mum.waa.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.waa.sms.model.Course;

@Controller
public class CourseController {
	@RequestMapping(value = { "/addCourse" }, method = RequestMethod.GET)
	public String addTM(@ModelAttribute("course") Course course, Model model) {
		return "addcourseform";
	}

	@RequestMapping(value = { "/addCourse" }, method = RequestMethod.POST)
	public String loginSubmit(@ModelAttribute("course") Course course) {
		return "dashboard";
	}
}
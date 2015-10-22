package mum.waa.sms.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.waa.sms.model.Course;
import mum.waa.sms.model.Entry;
import mum.waa.sms.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	CourseService courseService;

	@RequestMapping(value = { "/addCourse" }, method = RequestMethod.GET)
	public String addTM(@ModelAttribute("course") Course course, Model model) {
		return "addcourseform";
	}

	@RequestMapping(value = { "/addCourse" }, method = RequestMethod.POST)
	public String addCourse(@ModelAttribute("course") Course course, RedirectAttributes attribute) {
		courseService.saveCourse(course);
		attribute.addFlashAttribute(course);
		return "redirect:/courseInfo";
	}

	@RequestMapping(value = { "/courseInfo" }, method = RequestMethod.GET)
	public String addCourseSuccess(Model model) {
		Course course = (Course) ((ModelMap) model).get("course");
		return "courseInfo";
	}

	/*
	 * @RequestMapping(value = { "/result" }, method = RequestMethod.GET) public
	 * String loginSubmit(@ModelAttribute("course") Course course,
	 * RedirectAttributes attribute) { courseService.saveCourse(course);
	 * attribute.addFlashAttribute(course); return "dashboard"; }
	 */
	@ModelAttribute("entry")
	public Set<Entry> getStudentId() {
		Set<Entry> entry = new HashSet<Entry>(Arrays.asList(Entry.values()));
		return entry;
	}
}
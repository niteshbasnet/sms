package mum.waa.sms.controller;

import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.waa.sms.model.Student;
import mum.waa.sms.model.TM;

@Controller
public class TMController {

	@RequestMapping(value = { "/tmInfo" }, method = RequestMethod.GET)
	public String addTM(@ModelAttribute("student") TM tm, Model model) {
		return "tmInfo";
	}

	// @RequestMapping(value = { "/getStudent/{id}" }, method =
	// RequestMethod.GET)
	// public @ResponseBody Student getStudent(@PathVariable int id) {
	// // call student service to get student by id
	// System.out.println("called");
	// Student student = new Student();
	// student.setFirstName("riwaj");
	// student.setTm(new TM(4, 4, 3, 2));
	// return student;
	// }

	@RequestMapping(value = { "/getStudent/{id}" }, method = RequestMethod.GET)
	public String getStudent(@PathVariable int id) {
		// call student service to get student by id
		System.out.println("called");
		Student student = new Student();
		student.setFirstName("riwaj");
		student.setTm(new TM(4, 4, 3, 2));
		return "tmInfo";
	}

	@RequestMapping(value = { "/tmInfo" }, method = RequestMethod.POST)
	public String saveTM(@Valid @ModelAttribute("student") TM tm, BindingResult result) {
		// call student service save method
		return "";
	}

	@ModelAttribute("studentId")
	public Set<Integer> getStudentId() {
		Set<Integer> studentId = new HashSet<Integer>();
		for (int i = 1; i < 5; i++) {
			studentId.add(i);
		}
		return studentId;
	}
}
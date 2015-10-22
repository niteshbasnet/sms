package mum.waa.sms.controller;

import java.util.HashSet;
import java.util.Set;

import mum.waa.sms.model.Student;
import mum.waa.sms.model.TM;
import mum.waa.sms.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TMController {

	@Autowired
	StudentService service;

	@RequestMapping(value = { "/editTmInfo" }, method = RequestMethod.GET)
	public String addTM(@ModelAttribute("tm") TM tm, Model model) {
		return "editTmInfo";
	}

	@RequestMapping(value = { "/getStudent/{id}" }, method = RequestMethod.GET)
	public @ResponseBody TM getStudent(@PathVariable("id") int id) {
		System.out.println("called");
		Student student = service.getStudentById(id);
		// call student service to get student by id
		TM tm = student.getTm();
		tm.setdCRequirement(4);
		tm.setdCRequirement(4);
		// TM tm = new TM(23, 3, 4, 5, 6);
		return tm;
	}

	@RequestMapping(value = { "/editTmInfo" }, method = RequestMethod.POST)
	public String saveTM(@ModelAttribute("tm") TM tm) {
		Student student = service.getStudentById(tm.getStudentId());
		System.out.println("-----------------------------");
		System.out.println(tm.getdCLeft());
		student.getTm().setdCLeft(tm.getdCLeft());
		student.getTm().settMLeft(tm.gettMLeft());
		service.saveStudent(student);
		// System.out.println(tm.getStudentId());
		// System.out.println(tm.gettMRequirement());
		// System.out.println(tm.getdCRequirement());
		// System.out.println(tm.gettMLeft());
		// System.out.println(tm.getdCLeft());
		return "dashboard";
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
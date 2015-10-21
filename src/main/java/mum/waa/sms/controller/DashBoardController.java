package mum.waa.sms.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.waa.sms.model.Student;

/**
 * @author Regan
 *
 */
@Controller
public class DashBoardController {

	@RequestMapping(value = { "/addcourseform" }, method = RequestMethod.GET)
	public String addCourse(Model model) {
		return "addcourseform";
	}

	@RequestMapping(value = { "/addTMrequirementform" }, method = RequestMethod.GET)
	public String addTM(Model model) {
		return "addTMrequirementform";
	}
}

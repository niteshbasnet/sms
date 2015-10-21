package mum.waa.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Regan
 *
 */
@Controller
public class DashBoardController {

	@RequestMapping(value = { "/dashboard" }, method = RequestMethod.GET)
	public String dashboard(Model model) {
		return "dashboard";
	}
/*
	@RequestMapping(value = { "/addstudentform" }, method = RequestMethod.GET)
	public String addStudent(Model model) {
		return "addstudentform";
	}
*/
	/*
	 * @RequestMapping(value = { "/addstudentform" }, method =
	 * RequestMethod.POST) public String studentForm(Model model) { return
	 * "addstudent"; }
	 */

	// @RequestMapping(value = { "/addcourseform" }, method = RequestMethod.GET)
	// public String addCourse(Model model) {
	// return "addcourseform";
	// }

	// @RequestMapping(value = { "/addTMrequirementform" }, method =
	// RequestMethod.GET)
	// public String addTM(Model model) {
	// return "addTMrequirementform";
	// }
}

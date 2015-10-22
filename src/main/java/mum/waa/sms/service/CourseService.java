package mum.waa.sms.service;

import java.util.List;

import mum.waa.sms.model.Course;



public interface CourseService {

	public List<String> getCourse();

	public Course getCourseByName(String courseName);

}
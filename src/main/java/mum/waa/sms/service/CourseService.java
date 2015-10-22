package mum.waa.sms.service;

import java.util.List;

import mum.waa.sms.model.Course;
import mum.waa.sms.model.Entry;

public interface CourseService {

	public List<Course> getCourse();

	public void saveCourse(Course course);

	public List<Course> getCoursesByEntry(Entry entry);
}
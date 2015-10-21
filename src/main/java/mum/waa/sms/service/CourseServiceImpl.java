package mum.waa.sms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.waa.sms.model.Course;
import mum.waa.sms.repository.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courserepository;

	public List<String> getCourse() {
		List<String> liststring = new ArrayList<String>();
		List<Course> listcourse = (List<Course>) courserepository.findAll();
		for (Course course : listcourse) {
			liststring.add(course.getName());
		}
		return liststring;
	}

}

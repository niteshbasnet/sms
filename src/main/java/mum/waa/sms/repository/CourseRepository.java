package mum.waa.sms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import mum.waa.sms.model.Course;
import mum.waa.sms.model.Entry;

public interface CourseRepository extends CrudRepository<Course, Integer> {

	@Query("select s from Course s where s.entry=:entry")
	List<Course> findCoursesByEntry(Entry entry);

}

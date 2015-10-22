package mum.waa.sms.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Regan
 *
 */
@Entity
public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 707620149262582350L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "courses")
	private List<Student> students = new ArrayList<Student>();
	private String name;
	private String minimumGrade;
	private String professor;
	private String courseId;
	private Entry entry;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public long getid() {
		return id;
	}

	public void setid(long courseID) {
		this.id = courseID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public Entry getEntry() {
		return entry;
	}

	public void setEntry(Entry entry) {
		this.entry = entry;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMinimumGrade() {
		return minimumGrade;
	}

	public void setMinimumGrade(String minimumGrade) {
		this.minimumGrade = minimumGrade;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

}

package mum.waa.sms.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

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

	private String courseName;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Transient
	private String minimumGradeReq;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "courses")
	private List<Student> students;

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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getMinimumGradeReq() {
		return minimumGradeReq;
	}

	public void setMinimumGradeReq(String minimumGradeReq) {
		this.minimumGradeReq = minimumGradeReq;
	}

}

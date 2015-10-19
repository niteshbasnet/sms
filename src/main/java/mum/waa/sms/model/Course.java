package mum.waa.sms.model;

/**
 * @author Regan
 *
 */
public class Course {

	private String courseName;
	private String courseID;
	private String minimumGradeReq;

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
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

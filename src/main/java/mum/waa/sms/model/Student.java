package mum.waa.sms.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author nitesh
 *
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {
	private static final long serialVersionUID = 5400162374980514311L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;

	private Integer studentId;

	@Size(min = 2, max = 20, message = "first name not found")
	private String firstName;

	@Size(min = 2, max = 20, message = "first name not found")
	private String lastName;

	private String gender;

	@Email
	private String email;
	@Embedded
	private TM tm;

	private String studentImagePath;

	@Transient
	private MultipartFile studentImage;

	public TM getTm() {
		return tm;
	}

	public void setTm(TM tm) {
		this.tm = tm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Past
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date dob;

	// @Size(min = 10, max = 10, message =
	// "{Size.addStudent.phoneNumber.validation}")
	private long phoneNumber;

	private Entry entry;

	public Entry getEntry() {
		return entry;
	}

	public void setEntry(Entry entry) {
		this.entry = entry;
	}

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@Valid
	private Address address;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Course", joinColumns = { @JoinColumn(name = "Student_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Course_ID", nullable = false, updatable = false) })
	// @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	// @Valid
	// @JoinColumn
	private List<Course> courses;

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentImagePath() {
		return studentImagePath;
	}

	public void setStudentImagePath(String studentImagePath) {
		this.studentImagePath = studentImagePath;
	}

	public MultipartFile getStudentImage() {
		return studentImage;
	}

	public void setStudentImage(MultipartFile studentImage) {
		this.studentImage = studentImage;
	}

}

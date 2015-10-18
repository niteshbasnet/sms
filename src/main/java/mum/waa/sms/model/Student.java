package mum.waa.sms.model;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @author nitesh
 *
 */
public class Student implements Serializable {

	private static final long serialVersionUID = -5229223860253827517L;
	private String firstName;
	private String lastName;
	private String gender;
	private DateTimeFormat dob;
	private long phoneNumber;
	private Address address;

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

	public DateTimeFormat getDob() {
		return dob;
	}

	public void setDob(DateTimeFormat dob) {
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

}

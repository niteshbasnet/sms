package mum.waa.sms.model;

import javax.persistence.Transient;

/**
 * @author rriwaj
 *
 */
public class TM {
	@Transient
	private Integer studentId;
	private Integer tMRequirement;
	private Integer dCRequirement;
	private Integer tMLeft;
	private Integer dCLeft;

	public TM() {
		this.setdCRequirement(4);
		this.settMRequirement(4);
	}

	public TM(Integer studentId, Integer tMRequirement, Integer dCRequirement,
			Integer tMLeft, Integer dCLeft) {
		super();
		this.studentId = studentId;
		this.tMRequirement = 4;
		this.dCRequirement = 4;
		this.tMLeft = tMLeft;
		this.dCLeft = dCLeft;
	}

	public Integer gettMRequirement() {
		return tMRequirement;
	}

	public void settMRequirement(Integer tMRequirement) {
		this.tMRequirement = tMRequirement;
	}

	public Integer getdCRequirement() {
		return dCRequirement;
	}

	public void setdCRequirement(Integer dCRequirement) {
		this.dCRequirement = dCRequirement;
	}

	public Integer gettMLeft() {
		return tMLeft;
	}

	public void settMLeft(Integer tMLeft) {
		this.tMLeft = tMLeft;
	}

	public Integer getdCLeft() {
		return dCLeft;
	}

	public void setdCLeft(Integer dCLeft) {
		this.dCLeft = dCLeft;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

}
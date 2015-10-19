package mum.waa.sms.model;

import java.util.Date;

/**
 * @author Regan
 *
 */
public class TMRequirement {

	private Date date;
	private String type;
	private String descriptions;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

}

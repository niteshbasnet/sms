package mum.waa.sms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Housing {

	@Id
	private int roomNo;
	private int buildingNo;
	private boolean kitchenKey;

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getBuildingNo() {
		return buildingNo;
	}

	public void setBuildingNo(int buildingNo) {
		this.buildingNo = buildingNo;
	}

	public boolean isKitchenKey() {
		return kitchenKey;
	}

	public void setKitchenKey(boolean kitchenKey) {
		this.kitchenKey = kitchenKey;
	}

}

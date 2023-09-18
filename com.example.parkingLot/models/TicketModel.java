package models;

import java.sql.Timestamp;

public class TicketModel{
	private Long entryTime;
	private Long exitTime;
	private int price;
	private String vehicleType;
	private int allotedSlot;
	
	public int getAllotedSlot() {
		return allotedSlot;
	}
	public void setAllotedSlot(int allotedSlot) {
		this.allotedSlot = allotedSlot;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Long getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Long entryTime) {
		this.entryTime = entryTime;
	}
	public Long getExitTime() {
		return exitTime;
	}
	public void setExitTime(Long exitTime) {
		this.exitTime = exitTime;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

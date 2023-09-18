package models;

import helper.VehicleFactoryImpl;

public class ParkingSpaces {
	
	private int spaceNumber;
	private boolean occupied;
	private String user;
	private String vehicle;

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getSpaceNumber() {
		return spaceNumber;
	}

	public String getUser() {
		return user;
	}

	public ParkingSpaces(int spaceNumber) {
		this.spaceNumber = spaceNumber;
	}

	public boolean isOccupied() {
		
		if(occupied) {
			return true;
		}
		return false;
	}

}

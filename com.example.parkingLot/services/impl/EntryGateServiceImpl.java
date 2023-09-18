package services.impl;

import models.ParkingLot;
import models.ParkingSpaces;
import models.TicketModel;
import models.UserModel;
import services.EntryGateService;
import services.TicketService;

public class EntryGateServiceImpl implements EntryGateService {

	private String vehicleType;
	private UserModel userModel;

	/*
	 * public EntryGateImpl(String vehicleType) { super(); this.vehicleType =
	 * vehicleType; }
	 */

	@Override
	public void allocateparkingSlot(String vehicleType, UserModel user) {

		this.userModel = user;
		this.vehicleType = vehicleType;
		ParkingLot parkingLot = ParkingLot.getInstance();
		TicketService ticketService = new TicketServiceImpl();

		ParkingSpaces allottedSpace = parkingLot.allotParkingSpace(vehicleType, userModel.getUserName());
		
		System.out.println(allottedSpace.getSpaceNumber() + " " + allottedSpace.getVehicle());
		
		if(allottedSpace != null) {

			TicketModel currentTicket = ticketService.generateTicketAtEntry(vehicleType, allottedSpace);
			
			System.out.println("Kindly park your " + vehicleType + " at " + allottedSpace.getSpaceNumber());
			System.out.println();
		} else {
			System.out.println("No Parking Slot is available. Sorry!");
		}


	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

}

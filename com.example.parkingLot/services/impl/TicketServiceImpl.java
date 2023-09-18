package services.impl;

import java.util.List;

import models.ParkingLot;
import models.ParkingSpaces;
import models.TicketModel;
import services.TicketService;

public class TicketServiceImpl implements TicketService {
	
	public TicketModel generateTicketAtEntry(String vehicleType, ParkingSpaces parkingSpace) {
		
		if(parkingSpace != null) {
			TicketModel ticket = new TicketModel();
			ParkingLot parkingLot = ParkingLot.getInstance();
			List<TicketModel> activeTickets = parkingLot.getActiveTickets();
			if(vehicleType.equalsIgnoreCase("Bike")) {
				ticket.setPrice(bikeParkingCost);
			}
			if(vehicleType.equalsIgnoreCase("Car")) {
				ticket.setPrice(carParkingCost);
			}
			
			ticket.setVehicleType(vehicleType);
			ticket.setEntryTime(System.currentTimeMillis());
			ticket.setExitTime(System.currentTimeMillis());
			ticket.setAllotedSlot(parkingSpace.getSpaceNumber());
			
			
			parkingSpace.setOccupied(true);
			parkingSpace.setVehicle(vehicleType);
			
			System.out.println(ticket.getAllotedSlot() + " " + ticket.getPrice() + " " + ticket.getVehicleType() + " " + ticket.getEntryTime());
			
			activeTickets.add(ticket);
			
			System.out.println("Please take the ticket for your "+ vehicleType);
			
			return ticket;
		} 
		return null;
	}

}

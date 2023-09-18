package models;

import java.util.ArrayList;
import java.util.List;

//SingleTon class
public class ParkingLot {
	
	private static volatile ParkingLot instance;
	private List<ParkingSpaces> parkingSpaces;
	private List<TicketModel> activeTickets;
	
	private ParkingLot() {
		parkingSpaces = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			parkingSpaces.add(new ParkingSpaces(i));
		}
		
		activeTickets = new ArrayList<>();
	}
	
	public static synchronized ParkingLot getInstance() {
		if(instance == null) {
			instance = new ParkingLot();
		}
		
		return instance;
	}

	public void setParkingSpaces(List<ParkingSpaces> parkingSpaces) {
		this.parkingSpaces = parkingSpaces;
	}

	public void setActiveTickets(List<TicketModel> activeTickets) {
		this.activeTickets = activeTickets;
	}

	public ParkingSpaces allotParkingSpace(String vehicleType, String user) {
		
		for(ParkingSpaces space : parkingSpaces) {
			if(!space.isOccupied()) {
				return space;
			} 
		}	
		
		return null;
		
	}

	public List<ParkingSpaces> getParkingSpaces() {
		return parkingSpaces;
	}

	public List<TicketModel> getActiveTickets() {
		return activeTickets;
	}
}

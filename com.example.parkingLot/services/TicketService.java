package services;

import models.ParkingSpaces;
import models.TicketModel;

public interface TicketService {
	
	
	final int bikeParkingCost = 10;
	final int carParkingCost = 20;
	
	TicketModel generateTicketAtEntry(String vehicleType, ParkingSpaces parkingSpace);

}

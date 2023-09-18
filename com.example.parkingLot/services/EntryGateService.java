package services;

import models.UserModel;

public interface EntryGateService {
	
	final int bikeParkingCost = 10;
	final int carParkingCost = 20;
	
	void allocateparkingSlot(String vehicleType, UserModel user);

}

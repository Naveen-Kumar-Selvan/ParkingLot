package controller;

import models.UserModel;
import services.EntryGateService;
import services.impl.EntryGateServiceImpl;

public class ParkingLotController {

	public boolean createUser(String userName, int contactNumber, String vehicleType) {
		
		UserModel currentUser = new UserModel();
		EntryGateService entry = new EntryGateServiceImpl();
		currentUser.setUserName(userName);
		currentUser.setContactNo(contactNumber);
		
		System.out.println(currentUser.getUserName() + " " + currentUser.getContactNo());
		
		entry.allocateparkingSlot(vehicleType, currentUser);
		
		return false;
	}

}

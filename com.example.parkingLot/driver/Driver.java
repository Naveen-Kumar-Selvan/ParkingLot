package driver;

import java.util.Scanner;

import controller.ParkingLotController;
import models.ParkingLot;

public class Driver {

	public static void main(String[] args) {
		ParkingLot parkingLot = ParkingLot.getInstance();
		ParkingLotController controller = new ParkingLotController();
		
		boolean loop = true;
		
		while(loop) {
			System.out.println("1. Enter the Parking Lot \n2. Exit the Parking Lot\n3.Thank you!");
			Scanner s = new Scanner(System.in);
			
			int choice = s.nextInt();
			
			switch(choice) {
			
			case 1:{
				System.out.println("Please enter the userName");
				
				String userName = s.next();
				
				System.out.println("Please enter the contactNumber");
				
				int contactNumber = s.nextInt();
				
				System.out.println("Enter the type of Vehicle");
				
				String vehicleType = s.next();
				
				controller.createUser(userName, contactNumber, vehicleType);
			}
			}
		}
		
		//System.out.println("Please provide user details:");
	}

}

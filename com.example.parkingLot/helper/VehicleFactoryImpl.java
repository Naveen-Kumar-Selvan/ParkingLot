package helper;

public abstract class VehicleFactoryImpl implements VehicleFactory {
	
	private String vehicleType;
	
	public VehicleFactoryImpl(String vehicleType) {
		super();
		this.vehicleType = vehicleType;
	}

	public void createVehicleObject(String vehicleType) {

		switch(vehicleType) {
		case "Bike":{
			return;
		}
		
		case "Car":{
			return;
		}
		default:
			throw new IllegalArgumentException(vehicleType);
		}
	}
	
	

}

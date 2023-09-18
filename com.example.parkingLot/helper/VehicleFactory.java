package helper;


  public interface VehicleFactory {
  
  void createVehicleObject(String vehicleType); }
 

/*
 * public abstract class VehicleFactory {
 * 
 * private String vehicleType;
 * 
 * public VehicleFactory(String vehicleType) { super(); this.vehicleType =
 * vehicleType; }
 * 
 * public Vehicle createVehicleObject(String vehicleType) {
 * 
 * switch(vehicleType) { case "Bike":{ return null; }
 * 
 * case "Car":{ return null; } default: throw new
 * IllegalArgumentException(vehicleType); } }
 * 
 * 
 * 
 * }
 */

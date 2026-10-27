package practice3;

public class Mortorcycle extends Vehicle {
    private double capacity;
    public Mortorcycle(String vehicleNumber, Manufacturer manufacturer, int yearOfManufacture, String color, VehicleOwner owner,  double capacity) {
        super(vehicleNumber, manufacturer, yearOfManufacture, color, owner);
        this.capacity = capacity;
    }
    @Override
    public String getVehicleType() {
        return "MOTORCYCLE";
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
}

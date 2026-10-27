package practice3;

public class Truck extends Vehicle {
    private double tonnage;
    public Truck(String vehicleNumber, Manufacturer manufacturer, int yearOfManufacture, String color, VehicleOwner owner, double tonnage) {
        super(vehicleNumber, manufacturer, yearOfManufacture, color, owner);
        this.tonnage = tonnage;
    }
    public double getTonnage() {
        return tonnage;
    }
    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }
    @Override
    public String getVehicleType() {
        return "TRUCK";
    }
}

package practice3;

public class Car extends Vehicle {
    private String numberofSeats;
    private String engineType;
    public Car(String vehicleNumber, Manufacturer manufacturer, int yearOfManufacture, String color, VehicleOwner owner,String numberofSeats, String engineType) {
        super(vehicleNumber, manufacturer, yearOfManufacture, color, owner);
        this.numberofSeats = numberofSeats;
        this.engineType = engineType;
    }
    @Override
    public String getVehicleType() {
        return "CAR";
    }
    public String getNumberofSeats() {
        return numberofSeats;
    }
    public void setNumberofSeats(String numberofSeats) {
        this.numberofSeats = numberofSeats;
    }
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}

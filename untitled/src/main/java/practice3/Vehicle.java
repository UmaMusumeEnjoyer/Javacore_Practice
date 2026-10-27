package practice3;

import java.time.LocalDate;

public abstract class Vehicle {
    protected String vehicleNumber;
    protected Manufacturer manufacturer;
    protected int yearOfManufacture;
    protected String color;
    protected VehicleOwner owner;

    public Vehicle(String vehicleNumber, Manufacturer manufacturer, int yearOfManufacture, String color, VehicleOwner owner) {
        setVehicleNumber(vehicleNumber);
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.owner = owner;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        if(vehicleNumber.length() < 5) {
            throw new IllegalArgumentException("Invalid vehicle number");
        }
        this.vehicleNumber = vehicleNumber;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    public void setYearOfManufacture(int yearOfManufacture) {
        if(yearOfManufacture > 2000 && yearOfManufacture <= LocalDate.now().getYear()) {
            this.yearOfManufacture = yearOfManufacture;
        }
        else {throw new IllegalArgumentException("Invalid year");}
    }
    public abstract String getVehicleType();
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

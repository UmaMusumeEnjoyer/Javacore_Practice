package practice3;

import java.util.ArrayList;

public class VehicleManagement {
    private ArrayList<Vehicle> vehicles;
    public VehicleManagement() {
        vehicles = new ArrayList<>();
    }
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public Vehicle getVehiclebyNumber(String vehicleNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleNumber().equals(vehicleNumber)) {
                return vehicle;
            }
        }
        return null;
    }

    public Vehicle getVehiclebyOwnerID(String cmnd){
        for (Vehicle vehicle : vehicles) {
            if (vehicle.owner.getCmnd().equals(cmnd)) {
                return vehicle;
            }
        }
        return null;
    }

    public void addVehicle(Vehicle vehicle) {
        for(Vehicle vehicle1 : vehicles){
            if(vehicle1.getVehicleNumber().equals(vehicle.getVehicleNumber())){
                throw new IllegalArgumentException("Vehicle already exists");
            }
        }
        vehicles.add(vehicle);
    }

    public void removeVehicle(Manufacturer manufacturer){
        vehicles.removeIf(vehicle1 -> vehicle1.getManufacturer().equals(manufacturer));
    }

    public void mostVehicleManufacture(){
        int Toyota = 0;
        int Yamaha = 0;
        int Suzuki = 0;
        int Honda = 0;
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getManufacturer().equals(Manufacturer.TOYOTA)){
                Toyota++;
            }
            if(vehicle.getManufacturer().equals(Manufacturer.HONDA)){
                Honda++;
            }
            if(vehicle.getManufacturer().equals(Manufacturer.SUZUKI)){
                Suzuki++;
            }
            if(vehicle.getManufacturer().equals(Manufacturer.YAMAHA)){
                Yamaha++;
            }
        }
        System.out.println("Hang nhieu xe nhat: " + Math.max(Math.max(Math.max(Toyota,Honda), Yamaha), Suzuki));
    }

    public int countManufacturers(Manufacturer manufacturer){
        int count = 0;
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getManufacturer().equals(manufacturer)){
                count++;
            }
        }
        return count;
    }

    public void vehicleTypeCount(){
        int carCount = 0;
        int truckCount = 0;
        int motorcycleCount = 0;
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getVehicleType().equals("CAR")){
                carCount++;
            }
            else if(vehicle.getVehicleType().equals("TRUCK")){
                truckCount++;
            }
            else if(vehicle.getVehicleType().equals("MOTORCYCLE")) {
                motorcycleCount++;
            }
        }
        System.out.println("Car Vehicle Count: " + carCount);
        System.out.println("Truck Vehicle Count: " + truckCount);
        System.out.println("Motorcycle Vehicle Count: " + motorcycleCount);
    }
    public void sortVehicle(){
        vehicles.sort((v1, v2) -> v2.getVehicleNumber().compareTo(v1.getVehicleNumber()));
    }
}

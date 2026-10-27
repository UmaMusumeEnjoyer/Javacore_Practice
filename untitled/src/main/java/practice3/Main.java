package practice3;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================== 1. TEST TAO CHU XE (VEHICLE OWNER) ====================");
        VehicleOwner owner1 = null;
        VehicleOwner owner2 = null;
        try {
            owner1 = new VehicleOwner("123456789012", "Nguyen Van A", "vana@gmail.com");
            System.out.println("[OK] Tao chu xe 1: " + owner1.getFullName() + " | CMND: " + owner1.getCmnd());
            System.out.println("     Email hien tai cua chu xe 1: " + owner1.getEmail() + " (Luu y neu la null)");

            owner2 = new VehicleOwner("987654321098", "Tran Thi B", "thib@gmail.com");
            System.out.println("[OK] Tao chu xe 2: " + owner2.getFullName() + " | CMND: " + owner2.getCmnd());
        } catch (Exception e) {
            System.out.println("[LOI] Tao VehicleOwner: " + e.getMessage());
        }

        System.out.println("\n==================== 2. TEST TAO PHUONG TIEN (CAR, MOTORCYCLE, TRUCK) ====================");
        Car car1 = null;
        Car car2 = null;
        Mortorcycle moto1 = null;
        Truck truck1 = null;
        try {
            // Car yeu cau 7 tham so (da bao gom engineType)
            car1 = new Car("29A12", Manufacturer.TOYOTA, 2021, "Den", owner1, "5", "Xang");
            System.out.println("[OK] Car 1: " + car1.getVehicleNumber() + " | Hang: " + car1.getManufacturer() 
                    + " | Loai: " + car1.getVehicleType() + " | Dong co: " + car1.getEngineType());

            car2 = new Car("29A88", Manufacturer.TOYOTA, 2023, "Trang", owner1, "7", "Dau");
            System.out.println("[OK] Car 2: " + car2.getVehicleNumber() + " | Hang: " + car2.getManufacturer() 
                    + " | Loai: " + car2.getVehicleType());

            moto1 = new Mortorcycle("29B34", Manufacturer.HONDA, 2022, "Do", owner1, 150.0);
            System.out.println("[OK] Motorcycle: " + moto1.getVehicleNumber() + " | Hang: " + moto1.getManufacturer() 
                    + " | Loai: " + moto1.getVehicleType());

            truck1 = new Truck("29C56", Manufacturer.SUZUKI, 2019, "Xanh", owner2, 3.5);
            System.out.println("[OK] Truck: " + truck1.getVehicleNumber() + " | Hang: " + truck1.getManufacturer() 
                    + " | Loai: '" + truck1.getVehicleType() + "' (Luu y neu rong)");
        } catch (Exception e) {
            System.out.println("[LOI] Tao phuong tien: " + e.getMessage());
        }

        System.out.println("\n==================== 3. TEST VEHICLE MANAGEMENT ====================");
        VehicleManagement vm = new VehicleManagement();

        // 3.1 Test addVehicle va bat loi trung bien so
        System.out.println("--- 3.1 Test addVehicle() & Kiem tra trung bien so ---");
        try {
            if (car1 != null) vm.addVehicle(car1);
            if (car2 != null) vm.addVehicle(car2);
            if (moto1 != null) vm.addVehicle(moto1);
            if (truck1 != null) vm.addVehicle(truck1);
            System.out.println("[OK] Them thanh cong 4 phuong tien vao danh sach. Tong so xe: " + vm.getVehicles().size());

            System.out.println("- Thu them xe co bien so trung '29A12':");
            Car duplicateCar = new Car("29A12", Manufacturer.HONDA, 2022, "Bac", owner2, "4", "Xang");
            vm.addVehicle(duplicateCar);
            System.out.println("[CANH BAO] Khong bat duoc trung bien so!");
        } catch (IllegalArgumentException e) {
            System.out.println("  -> [OK] Bat trung bien so thanh cong: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("  -> [LOI] Ngoai le khac: " + e);
        }

        // 3.2 Tim kiem theo bien so
        System.out.println("\n--- 3.2 Tim xe theo bien so '29A12' ---");
        Vehicle foundByNum = vm.getVehiclebyNumber("29A12");
        if (foundByNum != null) {
            System.out.println("[OK] Tim thay xe: " + foundByNum.getVehicleNumber() + " (" + foundByNum.getManufacturer() + ")");
        } else {
            System.out.println("[!] Khong tim thay xe 29A12");
        }

        // 3.3 Tim kiem theo CMND chu xe
        System.out.println("\n--- 3.3 Tim xe theo CMND chu xe '123456789012' ---");
        Vehicle foundByOwner = vm.getVehiclebyOwnerID("123456789012");
        if (foundByOwner != null) {
            System.out.println("[OK] Tim thay xe cua chu xe " + foundByOwner.owner.getFullName() + ": Bien so " + foundByOwner.getVehicleNumber());
        } else {
            System.out.println("[!] Khong tim thay xe cua chu xe");
        }

        // 3.4 Hang co nhieu xe nhat
        System.out.println("\n--- 3.4 Hang co nhieu xe nhat (mostVehicleManufacture) ---");
        try {
            vm.mostVehicleManufacture();
        } catch (Exception e) {
            System.out.println("[LOI] " + e.getMessage());
        }

        // 3.5 Thong ke tung loai xe
        System.out.println("\n--- 3.5 Thong ke theo tung loai xe (vehicleTypeCount) ---");
        vm.vehicleTypeCount();

        // 3.6 Xoa xe theo hang
        System.out.println("\n--- 3.6 Xoa xe hang TOYOTA (removeVehicle) ---");
        try {
            vm.removeVehicle(Manufacturer.TOYOTA);
            System.out.println("[OK] Xoa thanh cong. So xe con lai: " + vm.getVehicles().size());
        } catch (Exception e) {
            System.out.println("[CANH BAO/LOI] Khi goi removeVehicle: " + e);
        }

        System.out.println("\n==================== 4. TEST VALIDATION VA NGOAI LE ====================");
        // Test CMND < 12 ky tu
        try {
            System.out.println("- Thu tao chu xe co CMND < 12 ky tu ('123'):");
            new VehicleOwner("123", "Le Van C", "vanc@gmail.com");
        } catch (IllegalArgumentException e) {
            System.out.println("  -> [OK] Bat ngoai le: " + e.getMessage());
        }

        // Test bien so xe < 5 ky tu
        try {
            System.out.println("- Thu tao xe co bien so < 5 ky tu ('29A'):");
            new Car("29A", Manufacturer.HONDA, 2020, "Den", owner1, "4", "Xang");
        } catch (IllegalArgumentException e) {
            System.out.println("  -> [OK] Bat ngoai le: " + e.getMessage());
        }

        // Test setEmail
        if (owner1 != null) {
            try {
                System.out.println("- Thu goi setEmail('test@gmail.com'):");
                owner1.setEmail("test@gmail.com");
                System.out.println("  -> [OK] Set email thanh cong: " + owner1.getEmail());
            } catch (IllegalArgumentException e) {
                System.out.println("  -> [CANH BAO/LOI] Bi quang ngoai le khi setEmail: " + e.getMessage());
            }
        }
    }
}

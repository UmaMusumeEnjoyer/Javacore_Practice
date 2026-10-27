package practice2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== 1. TEST HANG THUC PHAM (FOOD) ==========");
        try {
            // Test 1 san pham da het han va con ton kho -> ky vong danh gia: Kho ban
            Food f1 = new Food("TP01", "Sua tuoi", 10, 20000,
                    LocalDate.now().minusMonths(2), LocalDate.now().minusDays(1), "Vinamilk");
            System.out.println("Thong tin: " + f1.thongtin());
            System.out.println("VAT (5%): " + f1.tinhVat());
            System.out.println("Danh gia tieu thu: " + f1.danhgiaTieuthu());
        } catch (Exception e) {
            System.out.println("Loi Food: " + e.getMessage());
        }

        System.out.println("\n========== 2. TEST HANG DIEN MAY (ELECTRONICS) ==========");
        try {
            // Test dien may ton kho < 3 -> ky vong danh gia: Ban duoc
            Electronics e1 = new Electronics("DM01", "Tu lanh", 2, 5000000, 12, 1.5);
            System.out.println("Thong tin: " + e1.thongtin());
            System.out.println("VAT (10%): " + e1.tinhVat());
            System.out.println("Danh gia tieu thu: " + e1.danhgiaTieuthu());
        } catch (Exception e) {
            System.out.println("Loi Electronics: " + e.getMessage());
        }

        System.out.println("\n========== 3. TEST HANG SANH SU (CROCKERY) ==========");
        try {
            // Test sanh su ton kho > 50 va luu kho > 10 ngay -> ky vong danh gia: Ban cham
            Crockery c1 = new Crockery("SS01", "Bat trang", 60, 30000,
                    LocalDate.now().minusDays(15), "Bat Trang");
            System.out.println("Thong tin: " + c1.thongtin());
            System.out.println("VAT (10%): " + c1.tinhVat());
            System.out.println("Danh gia tieu thu: " + c1.danhgiaTieuthu());
        } catch (Exception e) {
            System.out.println("Loi Crockery: " + e.getMessage());
        }

        System.out.println("\n========== 4. TEST DANH SACH HANG HOA (DSHH) ==========");
        try {
            DanhSachHH ds = new DanhSachHH();
            Food f2 = new Food("TP02", "Banh mi", 5, 10000,
                    LocalDate.now(), LocalDate.now().plusDays(3), "Kinh Do");
            ds.addHangHoa(f2);
            System.out.println("Them hang hoa TP02 vao danh sach thanh cong!");
        } catch (Exception e) {
            System.out.println("Loi khi thao tac voi DanhSachHH: " + e);
        }

        System.out.println("\n========== 5. TEST VALIDATION (NGOAI LE) ==========");
        try {
            System.out.println("- Thu tao san pham co so luong am (-5):");
            new Electronics("DM02", "May giat", -5, 4000000, 12, 2.0);
        } catch (IllegalArgumentException e) {
            System.out.println("-> Bat ngoai le dung: " + e.getMessage());
        }

        try {
            System.out.println("- Thu tao thuc pham ngay het han truoc ngay san xuat:");
            new Food("TP03", "Mi goi", 10, 5000,
                    LocalDate.now(), LocalDate.now().minusDays(2), "Hao Hao");
        } catch (IllegalArgumentException e) {
            System.out.println("-> Bat ngoai le dung: " + e.getMessage());
        }
    }
}


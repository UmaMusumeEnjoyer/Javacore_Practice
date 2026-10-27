package practice2;

import java.time.LocalDate;
import java.util.Date;

public class Food extends HangHoa{
    private LocalDate ngaySanXuat;
    private LocalDate ngayHethan;
    private String supplier;
    public Food(String maHang, String tenHang, int soLuong, double donGia,  LocalDate ngaySanXuat, LocalDate ngayHethan, String supplier) {
        super(maHang, tenHang, soLuong, donGia);
        this.ngaySanXuat = ngaySanXuat;
        setNgayHethan(ngayHethan);
        this.supplier = supplier;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }
    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    public LocalDate getNgayHethan() {
        return ngayHethan;
    }
    public void setNgayHethan(LocalDate ngayHethan) {
        if (ngayHethan.isBefore(this.ngaySanXuat)) {
            throw new IllegalArgumentException("Ngay het han khong the truoc ngay san xuat");
        }
        this.ngayHethan = ngayHethan;
    }
    @Override
    public double tinhVat(){
        return this.donGia * 5/100;
    }
    @Override
    public String danhgiaTieuthu(){
        if (this.soLuong > 0 && ngayHethan.isBefore(LocalDate.now())) {
            return "Khos bans";
        }
        return "";
    }
}

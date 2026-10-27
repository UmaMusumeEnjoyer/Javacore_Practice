package practice2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Crockery extends HangHoa{
    private LocalDate ngayNhapKho;
    private String nhaSanXuat;
    public Crockery(String maHang, String tenHang, int soLuong, double donGia,  LocalDate ngayNhapKho, String nhaSanXuat){
        super(maHang, tenHang, soLuong, donGia);
        this.ngayNhapKho = ngayNhapKho;
        this.nhaSanXuat = nhaSanXuat;
    }

    public LocalDate getNgayNhapKho() {
        return ngayNhapKho;
    }
    public void setNgayNhapKho(LocalDate ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }
    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public double tinhVat() {
        return this.donGia * 10/100;
    }

    @Override
    public String danhgiaTieuthu() {
        if(this.soLuong > 50 && (ChronoUnit.DAYS.between(this.ngayNhapKho, LocalDate.now()) >=10 )){
            return "Bans chaamj";
        }
        return "";
    }
}

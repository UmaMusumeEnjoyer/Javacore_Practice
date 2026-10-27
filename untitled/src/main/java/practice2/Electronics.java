package practice2;

public class Electronics extends HangHoa{
    private int sothangBaohanh;
    private double congSuat;
    public Electronics(String maHang, String tenHang, int soLuong,double donGia,int sothangBaohanh, double congSuat){
        super(maHang,tenHang,soLuong,donGia);
        this.sothangBaohanh = sothangBaohanh;
        this.congSuat = congSuat;
    }
    @Override
    public double tinhVat(){
        return this.sothangBaohanh * 10/100;
    }
    @Override
    public String danhgiaTieuthu(){
        if (this.soLuong < 3){
            return "Bans dduwowcj";
        }
        return "";
    }
    public int getSothangBaohanh() {
        return this.sothangBaohanh;
    }
    public void setSothangBaohanh(int sothangBaohanh) {
        this.sothangBaohanh = sothangBaohanh;
    }
    public double getCongSuat() {
        return this.congSuat;
    }
    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
}

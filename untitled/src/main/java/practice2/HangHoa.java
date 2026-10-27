package practice2;

public abstract class HangHoa{
    protected String maHang;
    protected String tenHang;
    protected int soLuong;
    protected double donGia;

    public HangHoa(String maHang, String tenHang, int soLuong, double donGia){
        this.maHang = maHang;
        this.tenHang = tenHang;
        setsoLuong(soLuong);
        setdonGia(donGia);
    }

    public String getmaHang(){
        return this.maHang;
    }
    public  String gettenHang(){
        return this.tenHang;
    }
    public int getsoLuong(){
        return this.soLuong;
    }
    public double getdonGia(){
        return this.donGia;
    }

    public void setsoLuong(int soLuong){
        if(soLuong<0){
            throw new IllegalArgumentException("So luong phai >= 0");
        }
        this.soLuong = soLuong;
    }
    public void setdonGia(double donGia){
        if(donGia<0){
            throw new IllegalArgumentException("Don gia phai >= 0");
        }
        this.donGia = donGia;
    }

    public abstract double tinhVat();
    public abstract String danhgiaTieuthu();
    public String thongtin(){
        return this.tenHang + " " +  this.maHang + " " + this.soLuong + " " + this.donGia;
    }
}
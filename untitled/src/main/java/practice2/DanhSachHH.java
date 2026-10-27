package practice2;
import practice2.HangHoa;

public class DanhSachHH {
    private HangHoa[] hangHoas;
    private int count;

    public DanhSachHH(){
        hangHoas = new HangHoa[100];
    }
    public boolean checkDuplicateID(String id){
        for(int i = 0; i < this.count; i++){
            if (this.hangHoas[i].equals(id)){
                return true;
            }
        }
        return false;
    }

    public void addHangHoa(HangHoa h){
        if(checkDuplicateID(h.maHang)){
            throw new IllegalArgumentException("Ma hang trung alp");
        }
        this.hangHoas[this.count] = h;
        this.count++;

    }
}

package practice3;

public class VehicleOwner {
    private String cmnd;
    private String fullName;
    private String email;

    public VehicleOwner(String cmnd, String fullName, String email) {
        setCmnd(cmnd);
        this.fullName = fullName;

    }
    public String getCmnd() {
        return cmnd;
    }
    public void setCmnd(String cmnd) {
        if(cmnd.length() < 12){
            throw new IllegalArgumentException("cmnd length less than 12");
        }
        this.cmnd = cmnd;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(email.matches("^[\\\\w.-]+@[\\\\w.-]+\\\\.[a-zA-Z]{2,4}$")){
            this.email = email;
        }
        else {throw new IllegalArgumentException("Invalid email");}

    }
}

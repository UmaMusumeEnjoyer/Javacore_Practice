package practice1;

public class Circle extends Shape{
    private double r;
    Circle(double r){
        super(r, r);
        this.r = r;
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea(){
        return Math.PI * r * r;
    }
    public double getPerimeter(){
        return 2*Math.PI*r;
    }
}
package practice1;

public class Rectangle extends Shape {
    Rectangle(double width, double height) {
        super(width, height);
    }

    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width * 2 + this.height * 2);
    }
}

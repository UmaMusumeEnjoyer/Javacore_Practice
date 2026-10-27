package practice1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Shape shape = new Shape(10, 10);
        System.out.println("Shape width: " + shape.getWidth());
        System.out.println("Shape height: " + shape.getHeight());
        shape.height = 67;
        shape.width = 99;
        System.out.println(shape.getWidth()+ " " + shape.getHeight());

        Rectangle rec = new Rectangle(16, 17);
        System.out.println("Rectangle width: " + rec.getWidth());
        System.out.println("Rectangle height: " + rec.getHeight());
        System.out.println("Rectangle area: " + rec.getArea());
        System.out.println("Rectangle perimeter: " + rec.getPerimeter());

        Circle circle = new Circle(10);
        System.out.println("Circle r: " + circle.getR());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
    }
}

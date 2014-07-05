package Chapter11;

/**
 * Created by naatiqullahmohammed on 01/07/14.
 */
public class Circle extends GeometricObject {

    private double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSub-Object: Circle" +
                ", Radius: "+radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c);
    }
}

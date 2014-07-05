package Chapter10;

/**
 * Created by naatiqullahmohammed on 27/06/14.
 */
public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    public boolean contains(double x, double y) {
        return  contains(new Circle2D(x,y,0.0));
    }

    public boolean contains(Circle2D circle)    {
        return (distance(x, y, circle.x, circle.y) + circle.radius) < radius;
    }

    public boolean overlaps(Circle2D circle) {
        return (radius + circle.radius) > distance(x, y, circle.x, circle.y);
    }

    private double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.contains(3,3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

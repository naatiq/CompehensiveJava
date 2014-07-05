package Chapter9;

/**
 * Created by naatiqullahmohammed on 27/06/14.
 */
public class RegularPolygon {

    //Number of sides of the polygon
    private int n = 3;
    //Length of side
    private double side= 1;
    //x and y coordinates of the center
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {

    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getNumberOfSides() {
        return n;
    }

    public void setNumberOfSides(int n) {
        this.n = n;
    }

    public double getSideLength() {
        return side;
    }

    public void setSideLength(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args)  {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6, 4);
        RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6 , 7.8);
        System.out.println("Poly1: Area = " + poly1.getArea() + "   Perimeter = " + poly1.getPerimeter());
        System.out.println("Poly2: Area = " + poly2.getArea() + "   Perimeter = " + poly2.getPerimeter());
        System.out.println("Poly3: Area = " + poly3.getArea() + "   Perimeter = " + poly3.getPerimeter());

    }

}

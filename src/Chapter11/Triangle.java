package Chapter11;

/**
 * Created by naatiqullahmohammed on 01/07/14.
 */
public class Triangle extends GeometricObject {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle(){}

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        if(side1 + side2 <= side3) throw new IllegalTriangleException();
        else if(side2 + side3 <= side1) throw new IllegalTriangleException();
        else if(side1 + side3 <= side2) throw new IllegalTriangleException();
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    private class IllegalTriangleException extends Exception {

    }

    public static void main(String[] args) {
        try {
            Triangle t = new Triangle(5.0,4.0,3.0);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}

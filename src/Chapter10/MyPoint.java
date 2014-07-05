package Chapter10;

/**
 * Created by naatiqullahmohammed on 28/06/14.
 */
public class MyPoint {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint() {
        x = 0.0;
        y = 0.0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(x-point.x , 2) + Math.pow(y-point.y, 2));
    }

    public double distance(double x, double y) {
        return distance(new MyPoint(x,y));
    }

    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println(p1.distance(p2));
    }
}

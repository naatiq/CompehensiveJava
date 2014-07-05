package Chapter10;

import java.awt.geom.Point2D;

/**
 * Created by naatiqullahmohammed on 28/06/14.
 */
public class Line2D {
    private double m; // Slope of the line
    private double c; // Y intercept of the line.

    public double getM() {
        return m;
    }

    public double getC() {
        return c;
    }

    public Line2D(MyPoint p1, MyPoint p2) {
        this.m = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        this.c = p1.getY() - m * p1.getX();
    }

    public Line2D(double m, double c) {
        this.m = m;
        this.c = c;
    }

    public boolean onLine(MyPoint p1) {
        return m * p1.getX() + c - p1.getY() < 0.000001;
    }

    public MyPoint intersection(Line2D line) {
        if(line.getM() == m)  throw new Error("Both lines are parallel");
        double x = (c - line.c) / (line.m - m);
        double y = m*x + c;
        return new MyPoint(x,y);
    }

    @Override
    public String toString() {
        return "y = "+m+"x + " + c;
    }

    public static void main(String[] args) {
        Line2D l1 = new Line2D(new MyPoint(0,0) , new MyPoint(1,1));
        Line2D l2 = new Line2D(new MyPoint(0,0) , new MyPoint(-1,1));
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1.intersection(l2));

    }
}

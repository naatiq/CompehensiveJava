package Chapter10;

/**
 * Created by naatiqullahmohammed on 27/06/14.
 */
public class Triangle2D {
    MyPoint p1;
    MyPoint p2;
    MyPoint p3;

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public Triangle2D() {
        p1 = new MyPoint(0,0);
        p2 = new MyPoint(1,1);
        p3 = new MyPoint(2,5);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - p1.distance(p2)) * (s - p2.distance(p3)) * (s - p3.distance(p1)));
    }

    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    public boolean contains(MyPoint p) {
        Double a1 = new Triangle2D(p,p1,p2).getArea();
        Double a2 = new Triangle2D(p,p2,p3).getArea();
        Double a3 = new Triangle2D(p,p3,p1).getArea();

        return a1 + a2 + a3 < getArea();
    }

    public boolean contains(Triangle2D t) {
        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }

    public boolean onTriangle(MyPoint p) {
        Double a1 = new Triangle2D(p,p1,p2).getArea();
        Double a2 = new Triangle2D(p,p2,p3).getArea();
        Double a3 = new Triangle2D(p,p3,p1).getArea();

        return a1 + a2 + a3 - getArea() < 0.00001;
    }
}

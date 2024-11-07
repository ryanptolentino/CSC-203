import java.awt.Point;
import java.awt.Color;

public class Triangle implements Shape{

    private Point a;
    private Point b;
    private Point c;
    private Color color;

    public Triangle(Point a, Point b, Point c, Color color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    public Point getVertexA() {
        return a;
    }

    public Point getVertexB() {
        return b;
    }

    public Point getVertexC() {
        return c;
    }

    public boolean equals(Object o){
        if(o instanceof Triangle){
            Triangle t = (Triangle)o;
            return t.a.equals(this.a) &&
                    t.b.equals(this.b) &&
                    t.c.equals(this.c);
        }
        return false;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color c) {
        color = c;
    }

    public double getArea() {
        double s = getPerimeter()/2.0;
        double a = this.a.distance(this.b);
        double b = this.b.distance(this.c);
        double c = this.c.distance(this.a);
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public double getPerimeter() {
        return a.distance(b)+b.distance(c)+c.distance(a);
    }


    public void translate(Point p) {
        this.a.x += p.getX();
        this.a.y += p.getY();
        this.b.x += p.getX();
        this.b.y += p.getY();
        this.c.x += p.getX();
        this.c.y += p.getY();
    }

}

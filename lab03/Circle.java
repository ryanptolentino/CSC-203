import java.awt.Color;
import java.awt.Point;

public class Circle implements Shape{

    private Point center;
    private double radius;
    private Color color;

    public Circle(double radius, Point center, Color color )
    {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }


    public Point getCenter()
    {
        return center;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean equals(Object o){
        double delta = 0.000001;
        if(o instanceof Circle) {
            Circle c = (Circle)o;
            return c.center.equals(this.center) && Math.abs(c.radius - this.radius) < delta
                    && c.color.equals(this.color);
        }
        return false;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI  * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void translate(Point p) {
        this.center.x += p.getX();
        this.center.y += p.getY();
    }
}

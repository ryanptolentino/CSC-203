import java.awt.Color;
import java.awt.Point;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private Point topLeft;
    private Color color;

    public Rectangle(double width, double height, Point topLeft, Color color)
    {
        this.width = width;
        this.height = height;
        this.topLeft = topLeft;

    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
       this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public Point getTopLeft()
    {
        return topLeft;
    }

    public boolean equals(Object o) {
        double delta = 0.000001;
        if (o instanceof Rectangle) {
            Rectangle r = (Rectangle)o;
            return Math.abs(r.width - this.width) < delta &&
                    Math.abs(r.height - this.height) < delta &&
                    r.topLeft.equals(this.topLeft) &&
                    r.color.equals(this.color);
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
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public void translate(Point p) {
        this.topLeft.x += p.getX();
        this.topLeft.y += p.getY();
    }
}

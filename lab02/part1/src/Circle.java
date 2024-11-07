public class Circle {

    private Point center;

    private double radius;

    public Circle(final Point center, final double radius)
    {
        this.center = center;
        this.radius = radius;
    }


    public Point getCenter()
    {
        return center;
    }

    public double getRadius()
    {
        return radius;
    }
}

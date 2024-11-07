public class Rectangle
{
    private Point top_left;
    private Point bottom_right;

    public Rectangle(Point top_left, Point bottom_right)
    {
        this.top_left = top_left;
        this.bottom_right = bottom_right;
    }

    public Point getTopLeft()
    {
        return top_left;
    }

    public Point getBottomRight()
    {
        return bottom_right;
    }

    public double perimeter() {
        double length = Math.abs(bottom_right.getX() - top_left.getX());
        double height = Math.abs(top_left.getY() - bottom_right.getY());

        return (height * 2) + (length * 2);
    }
}


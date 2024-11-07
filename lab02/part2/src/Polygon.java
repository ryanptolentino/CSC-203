import java.util.List;

public class Polygon
{
    private List<Point> points;

    public Polygon(List<Point> points)
    {
        this.points = points;
    }

    public List<Point> getPoints()
    {
        return points;
    }

    public double perimeter() {

        double p = 0.0;

        for (int i = 0; i <= points.size() - 1; i++) {
            //delta x is
            if (i == points.size() - 1) {

                Point point1 = points.get(points.size() - 1);
                Point point2 = points.get(0);

                double length = Math.abs(point1.getX() - point2.getX());
                double height = Math.abs(point1.getY() - point2.getY());

                p = p + Math.sqrt(Math.pow(length, 2) + Math.pow(height, 2));

            } else {

                Point point1 = points.get(i + 1);
                Point point2 = points.get(i);

                double length = Math.abs(point1.getX() - point2.getX());
                double height = Math.abs(point1.getY() - point2.getY());

                p = Math.sqrt(Math.pow(length, 2) + Math.pow(height, 2)) + p;
            }
        }
        return p;
    }
}

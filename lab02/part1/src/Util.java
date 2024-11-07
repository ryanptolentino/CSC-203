public class Util
{

    public static double perimeter(Circle circle)
    {
        return 2 * circle.getRadius() * Math.PI;
    }

    public static double perimeter(Rectangle rectangle)
    {
        double length = Math.abs(rectangle.getBottomRight().getX() - rectangle.getTopLeft().getX());
        double height = Math.abs(rectangle.getTopLeft().getY() - rectangle.getBottomRight().getY());

        return (height * 2) + (length * 2);
    }

    public static double perimeter(Polygon polygon) {

        double p = 0.0;

        for (int i = 0; i <= polygon.getPoints().size() - 1; i++) {
            //delta x is
            if (i == polygon.getPoints().size() - 1) {

                Point point1 = polygon.getPoints().get(polygon.getPoints().size() - 1);
                Point point2 = polygon.getPoints().get(0);

                double length = Math.abs(point1.getX() - point2.getX());
                double height = Math.abs(point1.getY() - point2.getY());

                p = p + Math.sqrt(Math.pow(length, 2) + Math.pow(height, 2));

            } else {

                Point point1 = polygon.getPoints().get(i + 1);
                Point point2 = polygon.getPoints().get(i);

                double length = Math.abs(point1.getX() - point2.getX());
                double height = Math.abs(point1.getY() - point2.getY());

                p = Math.sqrt(Math.pow(length, 2) + Math.pow(height, 2)) + p;
            }
        }
        return p;
    }
}

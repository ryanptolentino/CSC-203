public class Bigger {

    public static double whichIsBigger(Circle circle, Rectangle rect, Polygon poly)
    {
        double c = Util.perimeter(circle);
        double r = Util.perimeter(rect);
        double p = Util.perimeter(poly);

        return Math.max(c, Math.max(r, p));
    }
}

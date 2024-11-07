public class Bigger {

    public static double whichIsBigger(Circle circle, Rectangle rect, Polygon poly)
    {
        return Math.max(circle.perimeter(), Math.max(rect.perimeter(), poly.perimeter()));
    }
}

public class AreaCalculator {
    // Method to get the circumference of a circle.
    public static double area(double radius)
    {
        if(radius < 0)
        {
            return -1;
        }

        double area = (radius * radius) * Math.PI;
        return area;
    }

    // Method to find the area of a square or rectangle.
    public static double area(double x, double y)
    {
        if((x < 0) || (y < 0))
        {
            return -1;
        }

        double area = x * y;
        return area;
    }
}

public class PointCP3 {
    private double x;
    private double y;

    // Constructor for Cartesian coordinates
    public PointCP3(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x coordinate
    public double getX() {
        return x;
    }

    // Getter for y coordinate
    public double getY() {
        return y;
    }

    // Method to compute polar coordinates
    public PolarPoint toPolar() {
        double radius = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        return new PolarPoint(radius, theta);
    }

    @Override
    public String toString() {
        return "Cartesian (" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        PointCP3 cartesianPoint = new PointCP3(3.0, 4.0);
        System.out.println(cartesianPoint); // Output: Cartesian (3.0, 4.0)

        PolarPoint polarPoint = cartesianPoint.toPolar();
        System.out.println(polarPoint); // Output: Polar (5.0, 0.93)
    }
}

class PolarPoint {
    private double radius;
    private double theta;

    public PolarPoint(double radius, double theta) {
        this.radius = radius;
        this.theta = theta;
    }

    @Override
    public String toString() {
        return "Polar (" + radius + ", " + theta + ")";
    }
}

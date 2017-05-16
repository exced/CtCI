package knearest;

public class DistanceMap {

    private double distance;
    private Point point;

    public DistanceMap(double distance, Point point) {
        this.distance = distance;
        this.point = point;
    }

    public double getDistance() {
        return this.distance;
    }

    public Point getPoint() {
        return this.point;
    }
}
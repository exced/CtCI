package knearest;

public class Point {
    
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
        * Compute the distance between 2 points
        */
    public double distance(Point other) {
        return Math.sqrt(Math.pow((this.x - other.getX()), 2) + Math.pow((this.y - other.getY()), 2));
    }

    public String toString() {
        return "x: " + this.x + ", y: " + this.y;
    }
}
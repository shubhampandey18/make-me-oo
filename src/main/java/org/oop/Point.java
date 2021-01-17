package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFrom(Point from) {
        return Math.sqrt(Math.pow(difference(from.x, this.x), 2) + Math.pow(difference(from.y, this.y), 2));
    }

    public double directionFrom(Point from) {
        return Math.atan2(difference(from.y, this.y), difference(from.x, this.x));
    }

    private double difference(double point1, double point2) {
        return point1 - point2;
    }
}

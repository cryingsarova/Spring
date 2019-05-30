package com.company.figures;

public class Circle implements Figure {

    private int radius;
    public static final double PI = 3.1415;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return radius*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

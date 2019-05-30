package com.company.figures;

public class Square implements Figure {

    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getSquare() {
        return length*length;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}

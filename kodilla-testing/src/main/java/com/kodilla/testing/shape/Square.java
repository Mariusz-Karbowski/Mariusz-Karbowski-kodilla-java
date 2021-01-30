package com.kodilla.testing.shape;

public class Square implements Shape {

    private double aEdgeLength;

    public Square(double aEdgeLength) {
        this.aEdgeLength = aEdgeLength;
    }

    public String getShapeName() {
        return "Square";
    }

    public Double getField() {
        return aEdgeLength * aEdgeLength;
    }
}

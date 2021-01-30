package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double aEdgeLength;
    private double bEdgeLength;

    public Triangle(double aEdgeLength, double bEdgeLength) {
        this.aEdgeLength = aEdgeLength;
        this.bEdgeLength = bEdgeLength;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public Double getField() {
        return (aEdgeLength * bEdgeLength) / 2;
    }
}

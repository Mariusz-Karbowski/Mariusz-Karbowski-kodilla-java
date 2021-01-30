package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double rCircleRadius;

    public Circle(double rCircleRadius) {
        this.rCircleRadius = rCircleRadius;
    }

    public String getShapeName() {
        return "Circle";
    }

    public Double getField() {
        return Math.PI * rCircleRadius * rCircleRadius;
    }
}

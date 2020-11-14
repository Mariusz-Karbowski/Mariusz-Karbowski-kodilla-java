package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    public ArrayList<Shape> shapesCollection = new ArrayList<Shape>();

    public List<Shape> getShapeCollection() {
        return shapesCollection;
    }

    public void addFigure(Shape shape) {
        shapesCollection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapesCollection.remove(shape);
    }

    public Shape getFigure(int i) {
        if (i < shapesCollection.size() && i >= 0) {
            return shapesCollection.get(i);
        } else {
            return null;
        }
    }

    public void showFigures() {
        System.out.println(shapesCollection.toString());
    }
}
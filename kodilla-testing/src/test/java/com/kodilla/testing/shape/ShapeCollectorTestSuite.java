package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Tests for shape Circle")
    class CircleTests {
        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector testShape = new ShapeCollector();
            Shape shape = new Circle(5);
            //When
            testShape.addFigure(shape);
            //Then
            Assertions.assertEquals(1, testShape.shapesCollection.size());
        }
        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector testShape = new ShapeCollector();
            Shape shape = new Circle(5);
            testShape.addFigure(shape);
            //When
            boolean result = testShape.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, testShape.shapesCollection.size());
        }
        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector testShape = new ShapeCollector();
            Shape shape = new Circle(5);
            testShape.addFigure(shape);
            //When
            Shape result = testShape.getFigure(0);
            //Then
            Assertions.assertEquals(shape, result);
        }
        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector testShape = new ShapeCollector();
            Shape shape = new Circle(5);
            testShape.addFigure(shape);
            ArrayList<Shape> shapeList = new ArrayList<>();
            shapeList.add(shape);
            //When
            ArrayList<Shape> shapeResultList = (ArrayList<Shape>) testShape.getShapeCollection();
            //Then
            Assertions.assertEquals(shapeList.toString(), shapeResultList.toString());
        }
    }
}

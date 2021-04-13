package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Pizza test :)")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PizzaOrderTestSuite {

    @DisplayName("Basic Pizza Cost")
    @Order(2)
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println("Price: " + theOrder.getCost() + " PLN" + "\n");
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @DisplayName("Basic Pizza Description")
    @Order(1)
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese", description);
    }

    @DisplayName("Pizza Extra Cheese Cost")
    @Order(4)
    @Test
    public void testPizzaOrderWithExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesePizzaDecorator(theOrder);
        System.out.println("Price: " + theOrder.getCost() + " PLN" + "\n");
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @DisplayName("Pizza Extra Cheese Description")
    @Order(3)
    @Test
    public void testPizzaOrderWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesePizzaDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese + extra cheese", description);
    }

    @DisplayName("Pizza Extra Ham Cost")
    @Order(6)
    @Test
    public void testPizzaOrderWithExtraHamGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraHamPizzaDecorator(theOrder);
        System.out.println("Price: " + theOrder.getCost() + " PLN" + "\n");
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(21), calculatedCost);
    }

    @DisplayName("Pizza Extra Ham Description")
    @Order(5)
    @Test
    public void testPizzaOrderWithExtraHamGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraHamPizzaDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese + extra ham", description);
    }

    @DisplayName("Pizza Extra Cheese & Ham Cost")
    @Order(8)
    @Test
    public void testPizzaOrderWithExtraCheeseAndHamGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesePizzaDecorator(theOrder);
        theOrder = new ExtraHamPizzaDecorator(theOrder);
        System.out.println("Price: " + theOrder.getCost() + " PLN" + "\n");
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(26), calculatedCost);
    }

    @DisplayName("Pizza Extra Cheese & Ham Description")
    @Order(7)
    @Test
    public void testPizzaOrderWithExtraCheeseAndHamGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheesePizzaDecorator(theOrder);
        theOrder = new ExtraHamPizzaDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese + extra cheese + extra ham", description);
    }
}

package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @DisplayName("When using empty list return empty List")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        boolean elements = true;
        ArrayList<Integer> entryData = new ArrayList<>();
        OddNumberExterminator oddNumbersExterminator = new OddNumberExterminator();
        oddNumbersExterminator.exterminate(entryData);
        for(Integer entry : oddNumbersExterminator.exterminate(entryData)) {
            if(entry % 2 != 0) {
                elements = false;
            }
        }
        if(elements) {
            System.out.println("EmptyList test OK");
        } else {
            System.out.println("EmptyList test failed!");
        }
    }
    @DisplayName("When using normal list (odd and even numbers) return even number List")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        boolean elements = true;
        ArrayList<Integer> entryData = new ArrayList<>();
        Random random = new Random();
        for(int i = 1; i < 100; i++){
            entryData.add(random.nextInt(100));
        }
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        oddNumberExterminator.exterminate(entryData);
        for(Integer entry : oddNumberExterminator.exterminate(entryData)) {
            if(entry % 2 != 0) {
                elements = false;
            }
        }
        if(elements) {
            System.out.println("NormalList test OK");
        } else {
            System.out.println("NormalList test failed!");
        }
    }
}

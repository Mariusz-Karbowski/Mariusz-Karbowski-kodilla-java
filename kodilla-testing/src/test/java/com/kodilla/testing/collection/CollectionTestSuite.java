package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
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
        System.out.println("Empty List test");
        //Given
        OddNumberExterminator oddNumbersExterminator = new OddNumberExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> expectedList = new ArrayList<>();
        //When
        ArrayList<Integer> emptyListExterminated = oddNumbersExterminator.exterminate(emptyList);
        //Then
        Assertions.assertEquals(expectedList, emptyListExterminated);
    }
    @DisplayName("When using normal list (odd and even numbers) return even number List")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Normal List test");
        //Given
        ArrayList<Integer> randomEntryNumbers = new ArrayList<>();
        Random random = new Random();
        for(int i = 1; i < 100; i++) {
            randomEntryNumbers.add(random.nextInt(100));
        }
        //When
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        ArrayList<Integer> evenNumbersList = oddNumberExterminator.exterminate(randomEntryNumbers);
        //Then
        Assertions.assertTrue(evenNumbersList.size() != 0);
        for(Integer evenNumber : evenNumbersList) {
            Assertions.assertEquals(0, evenNumber % 2);
        }
    }
}

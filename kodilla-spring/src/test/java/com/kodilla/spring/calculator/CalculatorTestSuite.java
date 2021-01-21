package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        //When
        calculator.add(2, 2);
        calculator.sub(5, 2);
        calculator.mul(3, 3);
        calculator.div(5, 2);
        //Then
        //do nothing
    }
}

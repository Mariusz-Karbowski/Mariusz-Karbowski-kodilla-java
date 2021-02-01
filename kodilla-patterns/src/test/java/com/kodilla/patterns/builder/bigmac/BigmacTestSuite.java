package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame seeds")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("lettuce")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("cheese")
                .ingredient("chilli peppers")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(5, howManyIngredients);
    }
}

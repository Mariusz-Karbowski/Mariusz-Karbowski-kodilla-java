package com.kodilla.patterns.strategy.social;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    public void testDefaultSharingSTrategies() {
        //Given
        User userM = new Millennials("Millennials");
        User userY = new YGeneration("YGen");
        User userZ = new ZGeneration("Gen");
        //When
        String millenialsUse = userM.sharePost();
        System.out.println("Millennials use: " + millenialsUse);
        String yGenerationUse = userY.sharePost();
        System.out.println("YGeneration use: " + yGenerationUse);
        String zGenerationUse = userZ.sharePost();
        System.out.println("ZGeneration use: " + zGenerationUse);
        //Then
        assertEquals("Facebook", millenialsUse);
        assertEquals("Twitter", yGenerationUse);
        assertEquals("Snapchat", zGenerationUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User userM = new Millennials("Steven Millennial");
        //When
        String millenialsUse = userM.sharePost();
        System.out.println("Millennials use: " + millenialsUse);
        userM.setSocialPublisher(new TwitterPublisher());
        millenialsUse = userM.sharePost();
        System.out.println("Millennials also use: " + millenialsUse);
        //Then
        assertEquals("Twitter", millenialsUse);
    }
}

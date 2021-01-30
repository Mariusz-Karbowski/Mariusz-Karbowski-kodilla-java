package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumberExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(Integer entry : numbers) {
            if(entry % 2 == 0) {
                evenNumbers.add(entry);
            }
        }
        return evenNumbers;
    }
}

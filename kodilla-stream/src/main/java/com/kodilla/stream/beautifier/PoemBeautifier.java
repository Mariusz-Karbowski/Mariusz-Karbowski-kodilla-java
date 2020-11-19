package com.kodilla.stream.beautifier;



public class PoemBeautifier {

    public void beautify(String toBeDecorated, PoemDecorator poemDecorator){
        System.out.println(poemDecorator.decorate(toBeDecorated));
    }
}

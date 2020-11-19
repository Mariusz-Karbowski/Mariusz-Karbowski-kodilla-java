package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
//import com.kodilla.stream.lambda.ExpressionExecutor;
//import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        /*ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);*/

        System.out.println("Text beautifier");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String textToBeBeautified = "This Text Needs Beautification.";
        String textToBeBeautified2 = " Opposite to this one.";
        poemBeautifier.beautify(textToBeBeautified,(toBeDecorated -> toBeDecorated.toUpperCase()));
        poemBeautifier.beautify(textToBeBeautified,(toBeDecorated -> toBeDecorated.toLowerCase()));
        poemBeautifier.beautify(textToBeBeautified,(toBeDecorated -> toBeDecorated.replace("Needs", "Needs No")));
        poemBeautifier.beautify(textToBeBeautified, (toBeDecorated -> toBeDecorated.replaceAll(" ", "_")));
        poemBeautifier.beautify(textToBeBeautified,(toBeDecorated -> "<<< " + toBeDecorated + " >>>"));
        poemBeautifier.beautify(textToBeBeautified,(toBeDecorated -> toBeDecorated.concat(textToBeBeautified2)));
    }
}

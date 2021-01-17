package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    private String productName;
    private int productQuantity;
    private double productPrice;

    public Product(String productName, int productQuantity, double productPrice) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }
}
package com.kodilla.good.patterns.challenges.orderservice;

public class Product {
    private String nameOfProduct;
    private int quantityOfProduct;
    private double price;

    public Product(String nameOfProduct, int quantityOfProduct, double price) {
        this.nameOfProduct = nameOfProduct;
        this.quantityOfProduct = quantityOfProduct;
        this.price = price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public double getPrice() {
        return price;
    }
}

package com.UG.model;

public class Product {
    private int id;
    private String ProductName;
    private String Unit;
    private double Quantity;
    private double Price;

    public Product(int id, String productName, String unit, double quantity, double price) {
        this.id = id;
        ProductName = productName;
        Unit = unit;
        Quantity = quantity;
        Price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public double getQuantity() {
        return Quantity;
    }

    public void setQuantity(double quantity) {
        Quantity = quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}

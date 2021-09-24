package com.example.coursespring.entities;

public class OrdemItem {

    private Integer Quantity;
    private Double price;

    public OrdemItem(){}

    public OrdemItem(Integer quantity, Double price) {
        Quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subTotal(){
        return getPrice()*getQuantity();
    }
}

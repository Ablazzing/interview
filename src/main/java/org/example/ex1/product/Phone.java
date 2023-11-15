package org.example.ex1.product;

public class Phone {
    private double price;

    public Phone(double price) {
        this.price = price;
    }

    public void call() {
        System.out.println("Телефон делает звонок");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

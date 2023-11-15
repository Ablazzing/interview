package org.example.ex1.product;

public class Computer {
    private double price;

    public Computer(float price) {
        this.price = price;
    }

    public void start() {
        System.out.println("Компьютер включен");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

package org.example.ex1;

import org.example.ex1.product.Computer;
import org.example.ex1.product.Phone;
import org.example.ex1.shop.ComputerShop;
import org.example.ex1.shop.PhoneShop;

public class Runner {
    public static void main(String[] args) {
        ComputerShop computerShop = new ComputerShop();
        PhoneShop phoneShop = new PhoneShop();

        Computer computer = computerShop.sellComputer();
        Phone phone = phoneShop.sellPhone();

        computer.start();
        phone.call();
    }
}

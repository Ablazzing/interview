package org.example.ex1.shop;

import org.example.ex1.product.Computer;

import java.util.List;
import java.util.stream.Collectors;

public class ComputerShop {
    private List<Computer> computers;

    public void buyComputers(List<Computer> computers) {
        computers = computers.stream().peek(e -> e.setPrice(e.getPrice() * 1.1)).collect(Collectors.toList());
    }

    public Computer sellComputer() {
        if (computers.size() == 0) {
            throw new RuntimeException("Компьютеры проданы");
        }
        return computers.remove(0);
    }
}

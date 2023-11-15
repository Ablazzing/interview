package org.example.ex1.shop;

import org.example.ex1.product.Phone;

import java.util.List;

public class PhoneShop {
    private List<Phone> phones;

    public void buyPhones(List<Phone> phones) {

    }

    public Phone sellPhone() {
        if (phones.size() == 0) {
            throw new RuntimeException("Компьютеры проданы");
        }
        return phones.remove(0);
    }
}

package com.borychowska.implement;

import com.borychowska.api.IPizza;

public class GoodPizza implements IPizza {
    private int price;
    private String name;

    public GoodPizza(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

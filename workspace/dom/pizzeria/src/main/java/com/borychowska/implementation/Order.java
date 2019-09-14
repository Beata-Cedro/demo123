package com.borychowska.implement;

import com.borychowska.api.IOrder;
import com.borychowska.api.IPizza;

public class Order implements IOrder {
    private IPizza pizza;

    public Order(IPizza pizza) {
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Zamówienie: "+ pizza.getName() + " cena: "+pizza.getPrice());
    }
}

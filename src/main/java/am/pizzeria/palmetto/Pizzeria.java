package am.pizzeria.palmetto;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private List<Order> orders;

    public Pizzeria() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public int getOrderCount() {
        return orders.size();
    }

    @Override
    public String toString() {
        return "Pizzeria Palmetto - Orders: " + orders.size();
    }
}
package am.pizzeria.palmetto;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private Customer customer;
    private List<Pizza> pizzas;

    public Order(Customer customer) {
        this.customer = customer;
        this.pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public double getTotalPrice() {
        double total = 0;

        for (Pizza pizza : pizzas) {
            total += pizza.getPrice();
        }

        return total;
    }

    @Override
    public String toString() {
        return "Order for " + customer.getName()
                + ", total: $" + getTotalPrice();
    }
}
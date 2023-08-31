package PkgPizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, double price, Topping... toppings) {
        this.name = name;
        this.price = price;
        for (Topping to : toppings) {
            this.toppings.add(to);
        }
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    @Override
    public String toString() {
        return "Pizza: " + name + " | Price: " + price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<Topping> getToppings() {
        return toppings;
    }
}

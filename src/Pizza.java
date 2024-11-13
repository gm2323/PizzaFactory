
import java.util.List;
import java.util.ArrayList;

public abstract class Pizza {
    private List<Topping> toppings = new ArrayList<>(); // List from Project 2 can be used here
    private Crust crust;
    private Size size;

    public Pizza(Crust crust, Size size) {
        this.crust = crust;
        this.size = size;
    }

    public abstract double price();

    public void addTopping(Topping topping) {
        if (toppings.size() < 7) { // up to 7 toppings
            toppings.add(topping);
        }
    }

    public void removeTopping(Topping topping) {
        toppings.remove(topping);
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public Crust getCrust() {
        return crust;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Pizza with crust: " + crust + ", size: " + size + ", toppings: " + toppings;
    }
}


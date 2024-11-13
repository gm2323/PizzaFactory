import java.util.List;
import java.util.ArrayList;

public class Order {
    private static int orderCounter = 0;
    private int orderNumber;
    private List<Pizza> pizzas;

    public Order() {
        this.orderNumber = ++orderCounter;
        this.pizzas = new ArrayList<>();
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void removePizza(Pizza pizza) {
        pizzas.remove(pizza);
    }

    public double calculateTotal() {
        double total = pizzas.stream().mapToDouble(Pizza::price).sum();
        return total + (total * 0.06625); // NJ Sales tax 6.625%
    }

    @Override
    public String toString() {
        return "Order #" + orderNumber + ", Total: $" + calculateTotal();
    }
}


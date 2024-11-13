import java.util.Arrays;

public class Meatzza extends Pizza{

    public Meatzza(Crust crust, Size size) {
        super(crust, size);

        this.getToppings().addAll(Arrays.asList(
                Topping.SAUSAGE,
                Topping.PEPPERONI,
                Topping.BEEF,
                Topping.HAM
        ));
    }

    @Override
    public double price() {
        switch (getSize()) {
            case SMALL: return 17.99;
            case MEDIUM: return 19.99;
            case LARGE: return 21.99;
            default: return 0;
        }
    }

}

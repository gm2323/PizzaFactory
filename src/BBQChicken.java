import java.util.Arrays;
public class BBQChicken extends Pizza {
    public BBQChicken(Crust crust, Size size) {
        super(crust, size);

        this.getToppings().addAll(Arrays.asList(
                Topping.BBQ_CHICKEN,
                Topping.GREEN_PEPPER,
                Topping.PROVOLONE,
                Topping.CHEDDAR
        ));
    }

    @Override
    public double price() {
        switch (getSize()) {
            case SMALL: return 14.99;
            case MEDIUM: return 16.99;
            case LARGE: return 19.99;
            default: return 0;
        }
    }
}
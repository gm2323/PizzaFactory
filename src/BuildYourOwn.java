public class BuildYourOwn extends Pizza {

    private static final double BASE_PRICE_SMALL = 8.99;
    private static final double BASE_PRICE_MEDIUM = 10.99;
    private static final double BASE_PRICE_LARGE = 12.99;
    private static final double TOPPING_PRICE = 1.69;

    public BuildYourOwn(Crust crust, Size size) {
        super(crust, size);
    }

    @Override
    public double price() {
        double basePrice;
        switch (getSize()) {
            case SMALL: basePrice = BASE_PRICE_SMALL; break;
            case MEDIUM: basePrice = BASE_PRICE_MEDIUM; break;
            case LARGE: basePrice = BASE_PRICE_LARGE; break;
            default: basePrice = 0;
        }
        return basePrice + (getToppings().size() * TOPPING_PRICE);
    }
}

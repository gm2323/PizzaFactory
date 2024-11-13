public class ChicagoPizza implements PizzaFactory {
    public Pizza createDeluxe() {
        return new Deluxe(Crust.DEEP_DISH, Size.MEDIUM);
    }

    public Pizza createMeatzza() {
        return new Meatzza(Crust.STUFFED, Size.MEDIUM);
    }

    public Pizza createBBQChicken() {
        return new BBQChicken(Crust.PAN, Size.MEDIUM);
    }

    public Pizza createBuildYourOwn() {
        return new BuildYourOwn(Crust.PAN, Size.MEDIUM);
    }
}

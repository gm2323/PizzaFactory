public class NYPizza implements PizzaFactory {
    public Pizza createDeluxe() {
        return new Deluxe(Crust.BROOKLYN, Size.MEDIUM);
    }

    public Pizza createMeatzza() {
        return new Meatzza(Crust.HAND_TOSSED, Size.MEDIUM);
    }

    public Pizza createBBQChicken() {
        return new BBQChicken(Crust.THIN, Size.MEDIUM);
    }

    public Pizza createBuildYourOwn() {
        return new BuildYourOwn(Crust.HAND_TOSSED, Size.MEDIUM);
    }
}
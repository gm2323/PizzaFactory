public class BuildYourOwnTest {

    public static void main(String[] args) {
        testPriceSmallWithOneTopping();
        testPriceLargeWithSevenToppings();
        testPriceMediumWithNoToppings();
        testPriceSmallWithMaxToppings();
        testPriceLargeWithNoToppings();
    }

    public static void testPriceSmallWithOneTopping() {
        BuildYourOwn pizza = new BuildYourOwn(Crust.HAND_TOSSED, Size.SMALL);
        pizza.addTopping(Topping.PEPPERONI);
        double expectedPrice = 8.99 + 1.69;
        System.out.println(pizza.price() == expectedPrice);
    }

    public static void testPriceLargeWithSevenToppings() {
        BuildYourOwn pizza = new BuildYourOwn(Crust.HAND_TOSSED, Size.LARGE);
        for (int i = 0; i < 7; i++) {
            pizza.addTopping(Topping.BBQ_CHICKEN);
        }
        double expectedPrice = 12.99 + (7 * 1.69);
        System.out.println(pizza.price() == expectedPrice);
    }

    public static void testPriceMediumWithNoToppings() {
        BuildYourOwn pizza = new BuildYourOwn(Crust.PAN, Size.MEDIUM);
        double expectedPrice = 10.99;
        System.out.println(pizza.price() == expectedPrice);
    }

    public static void testPriceSmallWithMaxToppings() {
        BuildYourOwn pizza = new BuildYourOwn(Crust.THIN, Size.SMALL);
        for (int i = 0; i < 7; i++) {
            pizza.addTopping(Topping.HAM);
        }
        double expectedPrice = 8.99 + (7 * 1.69);
        System.out.println(pizza.price() == expectedPrice);
    }

    public static void testPriceLargeWithNoToppings() {
        BuildYourOwn pizza = new BuildYourOwn(Crust.BROOKLYN, Size.LARGE);
        double expectedPrice = 12.99;
        System.out.println(pizza.price() == expectedPrice);
    }
}
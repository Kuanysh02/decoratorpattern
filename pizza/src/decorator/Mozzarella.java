package decorator;

public class Mozzarella extends PizzaDecorator {

    public Mozzarella(Pizza pizza) {
        super(pizza);
    }

    public double getMozzarellaPrice() {
        return 20;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + getMozzarellaPrice();
    }
}

package decorator;

public class Mushroom extends PizzaDecorator {
    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    public double getMushroomPrice(){
        return 17;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + getMushroomPrice();
    }
}

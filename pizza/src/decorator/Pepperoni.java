package decorator;

public class Pepperoni extends PizzaDecorator {
    public Pepperoni(Pizza pizza) {
        super(pizza);
    }

    public double getPepperoniPrice(){
        return 35;
    }
    @Override
    public double getPrice() {
        return super.getPrice() + getPepperoniPrice();
    }
}

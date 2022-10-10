import decorator.Mozzarella;
import decorator.Mushroom;
import decorator.Pizza;

public class Main {
    public static void main(String[] args) {

        Pizza margheritaPizza = new MargheritaPizza();
        System.out.println("Price of Margherita Pizza is:\n"
                + margheritaPizza.getPrice() + "\n");

        margheritaPizza = new Mushroom(margheritaPizza);
        margheritaPizza = new Mozzarella(margheritaPizza);
        System.out.println("Price of Margherita Pizza (with extra mushroom & mozzarella) is:\n"
                + margheritaPizza.getPrice() + "\n");
    }
}
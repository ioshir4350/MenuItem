package Item;

public class Trio implements MenuItem {
    Sandwich sandwich;
    Salad salad;
    Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName() {
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName();
    }

    public double getPrice() {
        double TrioPrice = 0;
        if (sandwich.getPrice() < drink.getPrice() && sandwich.getPrice() < salad.getPrice()) {
            TrioPrice = salad.getPrice() + drink.getPrice();
        } else if (salad.getPrice() < drink.getPrice() && salad.getPrice() < sandwich.getPrice()) {
            TrioPrice = sandwich.getPrice() + drink.getPrice();
        } else {
            TrioPrice = sandwich.getPrice() + salad.getPrice();
        }
        return TrioPrice;
    }
}

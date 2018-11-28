package Item;

public class Drink implements MenuItem{

    private String Name;
    private double Price;

    public Drink(String Name, double Price)
    {
        this.Name = Name;
        this.Price = Price;
    }

    public String getName()
    {
        return Name;
    }

    public double getPrice()
    {
        return Price;
    }
}

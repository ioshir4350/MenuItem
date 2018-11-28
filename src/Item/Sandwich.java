package Item;

public class Sandwich implements MenuItem{

    private String Name;
    private double Price;

    public Sandwich(String Name, double Price)
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

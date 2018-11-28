package Item;

public class Salad implements MenuItem{

    private String Name;
    private double Price;

    public Salad(String Name, double Price)
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


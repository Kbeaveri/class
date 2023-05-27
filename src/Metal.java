public class Metal
{
    private Integer price;
    private Integer weight;
    private String econductivity;
    private Integer coast;
    Metal()
    {
        this(0,0,"n/a");
    }
    Metal(Integer price, Integer weight, String econductivity)
    {
        this.price = price;
        this.weight = weight;
        this.econductivity = econductivity;
        fullCoastCalculation();
    }
    public void setPrice(Integer value)
    {
        this.price = value;
    }

    public Integer getPrice()
    {
        return price;
    }
    public void setWeight(Integer value)
    {
        this.weight = value;
    }

    public Integer getWeight()
    {
        return weight;
    }
    public void setEconductivity(String value)
    {
        this.econductivity = value;
    }
    public String getEconductivity()
    {
        return econductivity;
    }
    public Integer getFullSalary()
    {
        return coast;
    }
    private void fullCoastCalculation()
    {
        this.coast = weight*price;
    }
    public String toString()
    {
        return " Price: " + price + " | " + "Weight: " + weight + " | " + "Econductivity: " + econductivity + " | " + "Coast: " + coast;
    }
}
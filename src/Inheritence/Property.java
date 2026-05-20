package Inheritence;

public class Property {
    private int size;
    private String location;
    private double price;
    public Property (int size,String location,double price)
    {
        this.location=location;
        this.price=price;
        this.size=size;
    }
    public String getLocation ()
    {
        return location;
    }
    public int getSize(){
        return size;
    }
    public double getprice ()
    {

        return price;
    }
    public void displayDetails()
    {
        System.out.println("locaton is"+location);
        System.out.println("size"+size);
        System.out.println("price"+price);
    }

}

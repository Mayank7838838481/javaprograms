package Inheritence;

public class Appartment extends Property {
    private boolean hasvalcony;
    private int bhk;

    public Appartment(int size, String location, double price,
                      boolean hasvalcony,int bhk) {
        super(size, location, price);
    this.hasvalcony=hasvalcony;
    this.bhk=bhk;

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("BHK"+bhk);
        System.out.println("has valcony"+hasvalcony);
    }
}

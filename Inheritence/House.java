package Inheritence;

public class House extends Property {
    private int rooms;
    private boolean hasgarden;

    public House(int size, String location, double price,int rooms,boolean hasgarden) {
        super(size, location, price);
        this.hasgarden=hasgarden;
        this.rooms=rooms;

    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("no. of rooms"+rooms);
        System.out.println("has garden"+hasgarden);

    }
    }

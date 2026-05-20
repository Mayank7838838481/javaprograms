package Runtimepolymorphism;

public class Bike extends Vehicle{
    @Override
    public void horn() {
        super.horn();
        System.out.println("Bike Horn...");
    }
}

package Runtimepolymorphism;

public class Train extends Vehicle{
    @Override
    public void horn() {
        System.out.println("Train horn");
    }
}

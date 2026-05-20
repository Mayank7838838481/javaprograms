package Runtimepolymorphism;

public class test {
    static void main(String[] args) {
        Bike bike=new Bike();
        Car car=new Car();
        Truck truck=new Truck();
        Bus bus=new Bus();
        Train train=new Train();
        train.horn();
        bus.horn();
        truck.horn();
        bike.horn();
        car.horn();



    }
}

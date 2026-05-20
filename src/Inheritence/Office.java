package Inheritence;

public class Office extends Property {
    private int department;
    private int member;

    public Office(int size,String location,double price,int department,
                  int member) {
        super(size, location, price);
        this.department=department;
        this.member=member;

    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("no. of department"+department);
        System.out.println("no. of member"+member);

    }
}

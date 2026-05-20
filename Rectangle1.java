import java.util.Scanner;

public class Rectangle1 {
    static void main(String[] args) {
        Scanner rect= new Scanner(System.in);
        System.out.println("enter lenght");
        double l=rect.nextInt();
        System.out.println("enter breadth");
        double b= rect.nextInt();
        double area;
        area=2*(l+b);
        System.out.println("area is"+area);
        rect.close();

    }
}

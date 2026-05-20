import java.util.Scanner;

public class Takeinput {
    public static void main(String[] args) {
        Scanner swap = new Scanner(System.in);

        System.out.println("Enter value of a:");
        double a = swap.nextDouble();

        System.out.println("Enter value of b:");
        double b = swap.nextDouble();

        // Swapping using a temporary variable
        double temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Values after swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        swap.close();
    }
}
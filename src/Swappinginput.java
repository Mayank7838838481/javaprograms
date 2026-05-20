import java.util.Scanner;

public class Swappinginput {
    static void main(String[] args) {
        Scanner swap=new Scanner(System.in);
        System.out.println("enter value of a");
        double a=swap.nextInt();
        System.out.println("enter value of b");
        double b=swap.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a after swpa"+a);
        System.out.println("Value of b after swpa"+b);
        swap.close();

    }
}

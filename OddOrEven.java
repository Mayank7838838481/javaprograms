import java.util.Scanner;

public class OddOrEven {
    static void main(String[] args) {
        //int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = s.nextInt();
        if (num1%2==0)
        {
            System.out.println("Even Number");

        }
        else {
            System.out.println("Odd Number");
        }


    }


}

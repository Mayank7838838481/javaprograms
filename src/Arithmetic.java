import java.util.Scanner;

public class Arithmetic {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        double num1 = sc.nextInt();
        System.out.println("enter second number");
        double num2 = sc.nextInt();
        double sum = num1 + num2;
        System.out.println("Sum is "+sum);
        double mul=num1*num2;
        System.out.println(" mul is "+mul);
        double div= num1/num2;
        System.out.println("div is "+ div);
        double sub= num1-num2;
        System.out.println("sub is "+sub);
        sc.close();


    }
}

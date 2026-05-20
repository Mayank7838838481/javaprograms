package Lopping.forloop;

import java.util.Scanner;

public class rowandcolumn {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        int x = num.nextInt();

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {  // fix here
                System.out.print(j + " ");
            }
            System.out.println(); // move to next line
        }

        num.close();
    }
}
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner table = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = table.nextInt();

        System.out.println("Table is as follows:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        table.close();
    }
}
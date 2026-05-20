public class Printgrade {
    public static void main(String[] args) {

        double Hindi = 05, Maths = 15, Science = 20, SST = 55, Gk = 55, total;
        double per;

        total = Hindi + Maths + Science + SST + Gk;
        System.out.println("Total is " + total);

        per = (total / 500) * 100;
        System.out.println("Percentage is " + per);

        if (per >= 90) {
            System.out.println("Grade is A1");
        } else if (per >= 80 && per < 90) {
            System.out.println("Grade is A2");
        } else if (per >= 70 && per < 80) {
            System.out.println("Grade is B1");
        } else if (per >= 60 && per < 70) {
            System.out.println("Grade is B2");
        } else if (per >= 50 && per < 60) {
            System.out.println("Grade is C1");
        } else if (per >= 40 && per < 50) {
            System.out.println("Grade is C2");
        } else {
            System.out.println("Grade is D or Fail ");
        }
    }
}
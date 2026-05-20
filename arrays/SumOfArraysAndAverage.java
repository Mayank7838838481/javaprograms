package arrays;

public class SumOfArraysAndAverage {
    static void main(String[] args) {
        int[] arr={12,2,3,4,43,54,};
        int sum=0,avg=0;
        for (int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            avg=sum/ arr.length;

        }
        System.out.println(sum +" ");
        System.out.println(avg );

    }
}

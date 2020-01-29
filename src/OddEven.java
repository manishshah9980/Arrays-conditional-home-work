import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {    // main method

        int n, i, evensum = 0, oddsum = 0;
        Scanner scanner = new Scanner(System.in);   // created a scanner class

        System.out.println(" Enter no of elements in array: ");
        n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println(" Enter the elements of the array: ");

        for (i = 0; i < n; i++)

            if (a[i] % 2 == 0) {

            } else {
                oddsum = oddsum + a[i];

                System.out.println(" \n the sum of even numbers up to " + n + " = " + evensum);
                System.out.println(" \n the sum of odd numbers up to " + n + " = " + oddsum);


            }
    }
}
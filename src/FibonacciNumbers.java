import java.util.Scanner;

public class FibonacciNumbers
    // to find the number entered is fibonacci number or not
{
    public static void main(String[] args)           // main method
    {
        Scanner scanner = new Scanner(System.in);   // created scanner class
        {
            System.out.println(" Enter any number ");

            int num = scanner.nextInt();
            int i = 0, j = 1, nextterm;

            System.out.println(" is Fibonacci number");
            for (int c = 0;c<num;c++)
            {
                if(c<=1)
                nextterm = c;

                else {
                    nextterm = i + j;
                    i = j;
                    j = nextterm;
                }

            }
        }
    }
}

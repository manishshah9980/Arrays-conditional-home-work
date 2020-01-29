import java.sql.SQLOutput;
import java.util.Scanner;

public class ArmstrongNumber
    // to check given number is armstrong number or not
{
    public static void main(String[] args)   // main method
    {
        int c = 0,a, temp;
        Scanner scanner = new Scanner(System.in);         // created scanner class
        System.out.println(" enter any three digit number");

        int num = scanner.nextInt();
        temp = num;

        while (num> 0 )
        {
            a = num%10;
            num = num/10;
            c=c+(a*a*a);
        }
        if (temp == c )
            System.out.println(" armstrong number");
        else
            System.out.println(" not armstrong number");


    }
}

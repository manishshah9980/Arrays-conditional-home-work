


import java.util.Scanner;

public class ReverseNumber

    // program to find reverse number

{
    public static void main(String[] args) {


        // main method

        int num = 0;
        int reversenum = 0;

        Scanner scanner = new Scanner(System.in);  // created scanner clas
        System.out.println(" enter any number ");
        num = scanner.nextInt();
        while (num != 0) // while loop for check condition
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;

        }
        System.out.println(" reverse of the in put number is:" + reversenum);

    }
    }










































































































































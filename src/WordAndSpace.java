import java.util.Scanner;

public class WordAndSpace
{
    public static void main(String[] args) {
        int space = 0;
        int countword = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the string: ");
        String sentence = scanner.nextLine();

        for (int i = 0; i < sentence.length() ; i++)
        {
            if (sentence.charAt(i) ==' ')
            {
                space++;
                countword++;
            }

        }
        System.out.println(" number of spaces :" +space);
        System.out.println(" number of words:" +countword);

    }
}

import java.util.Arrays;

public class StringAndArray
{
    public static void main(String[] args)  // Main method
    {
        int[] my_array1 =
                {
                        1789, 1985, 2020, 2035, 1857,
                        2014, 2165 };
        String[] my_array2 = {

                "mahesh", "suresh","jayesh", "vipul","bakul"};

        System.out.println("Original numeric array : "+ Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("sorted numeric array :"+Arrays.toString(my_array1));



        System.out.println("Original string array :" +Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("sorted string array :" +Arrays.toString(my_array2));

        }


        }




public class TotalNumberOfString {
    public static void main(String[] args) {
        String string = "The world is not enough";

        int count = 0;

        //   counts each character exept space

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != 'i')
                count++;
        }
        {
            System.out.println("Totalnumber of character in string:" + count);
        }
    }
}



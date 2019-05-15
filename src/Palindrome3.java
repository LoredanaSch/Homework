public class Palindrome3 {


    public static void main(String[] args) {

        int number = 121;
        int reversedInteger = 0;
        int remainder;
        int originalInteger;

        originalInteger = number;

        while( number > 0 )
        {
            remainder = number % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            number  = number / 10;
        }

        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");

        else
            System.out.println(originalInteger + " is not a palindrome.");

    }
}

import java.util.Scanner;


public class Palindrome {

    private static Scanner sc;

    public static void main(String[] args) {

        String palindrome;
        String reverse = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string/number to check if it is a palindrome");

        palindrome = sc.nextLine();

        int length = palindrome.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + palindrome.charAt(i);

        if (palindrome.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");

        else
            System.out.println("Entered string/number isn't a palindrome.");


    }
}

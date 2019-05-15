import java.util.Scanner;

public class Reversestring {

    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);


        System.out.println("Enter the name to reverse: ");
        String name = sc.nextLine();
        String reverse = "";

        for(int i = name.length() - 1; i >= 0; i --){
            reverse = reverse + name.charAt(i);
        }

        System.out.print("Reversed name is: " + reverse);


    }
}

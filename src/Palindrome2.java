public class Palindrome2 {

    public static void main(String[] args) {

        int[] Numbers = {1, 2, 3, 2, 1};

        int firstIndex = 0;
        int lastIndex = Numbers.length - 1;

        for (int i = 0; i < Numbers.length; i++) {

            if (Numbers[firstIndex] == Numbers[lastIndex]) {
                System.out.println(Numbers[firstIndex] + " is a palindrome");

            }
            else {
                System.out.println(Numbers[firstIndex] + " Is not");

            }

            firstIndex++;
            lastIndex--;
        }
    }
}


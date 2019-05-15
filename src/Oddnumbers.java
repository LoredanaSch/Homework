
public class Oddnumbers {

    public static void main(String[] args) {

                System.out.println("Odd numbers are: ");

        for (int i = 1; i < 100; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
                System.out.println("\n");
                System.out.println("Even numbers are: ");
                Evennumbers();

    }

    public static void Evennumbers(){

        for (int i = 0; i<100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

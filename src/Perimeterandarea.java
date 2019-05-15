import java.util.Scanner;

public class Perimeterandarea {

    private static Scanner sc;



    public static void main(String[] args) {

        double height;
        double width;
        double area;
        double perimeter;

        sc  = new Scanner(System.in);

        System.out.println("Enter the value for the Height of a rectangle = ");
        height = sc.nextDouble();
        System.out.println("Enter the value for the width of a rectangle = ");
        width = sc.nextDouble();


        area = height * width;
        perimeter = 2 * (height + width);

        System.out.format("Area of the rectangle is = %.2f\n", area);

        System.out.format("Perimeter of the rectangle is = %.2f\n", perimeter);

        System.out.println("Process done for rectangle");

        Hexagon();


    }

        public static void Hexagon(){

            double lenght;
            double area;
            double perimeter;

            sc = new Scanner(System.in);

            System.out.println("Enter the value for the length of the hexagon = ");
            lenght = sc.nextDouble();

            perimeter = 6 * lenght;
            area = (3 * Math.sqrt(3))/2 * Math.pow(lenght, 2);

            System.out.print("Perimeter of the hexagon is = " + perimeter + "\n");
            System.out.print("Area of the hexagon is = " + area + "\n");

            System.out.println("Process done for hexagon");

        }
}

import java.util.Scanner;

public class Distancetwopoints {

    private static Scanner sc;

    public static void main(String[] args) {

        int longitude1;
        int latitude1;
        int longitude2;
        int latitude2;
        double distance;

        sc = new Scanner(System.in);

        System.out.println("Enter the value for longitude1");
        longitude1 = sc.nextInt();

        System.out.println("Enter the value for latitude1");
        latitude1 = sc.nextInt();

        System.out.println("Enter the value for longitude2");
        longitude2 = sc.nextInt();

        System.out.println("Enter the value for latitude2");
        latitude2 = sc.nextInt();

        distance = Math.sqrt((longitude2 - longitude1) * (longitude2 - longitude1) + (latitude2 - latitude1) * (latitude2 - latitude1));

        System.out.print("Distance between  two points pon the surface of earth is " + distance);


    }
}

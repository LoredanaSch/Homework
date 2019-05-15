public class Example3 {


    public static void main(String[] args) {

       int x = 10;
       int y = 15;

        switch (x-y){
            case 3 :
                System.out.println(y);
                break;
            case 9 :
                System.out.println(x);
                break;
            case -5 :
                System.out.println(x+y);
                break;
            default :
                System.out.println("Break");
        }

    }
}

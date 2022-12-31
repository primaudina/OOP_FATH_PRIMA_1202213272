import java util Scanner ;
import java util InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Scanner input = new Scanner (System.in);
        calculation calculation = new calculation();
        int Menu;

        do{
            System.out.println("Menu Program\n1. Square\n2. Circle\n3. TRapeZoid\n0. Finish");
            try{
                System.out.println("Select Menu : ");
                Menu = input.nextInt();
                switch (Menu){
                    case 1: 
                        System .out.println("\nEnter the length of the side of the square : ");
                        double side = input.nextDouble();
                        System.out.println("\nProgram Will Start In");
                        x.setSquare(side);
                        thread_1.start();
                        thread_1.join();
                        System.out.println("\nThe calculation result :" + x.getSquare());
                        break;

                    case 2:
                        System .out.println("\nEnter the radius of circle : ");
                        double radius = input.nextDouble();
                        System.out.println("\nProgram Will Start In");
                        x.setSquare(radius);
                        thread_1.start();
                        thread_1.join();
                        System.out.println("\nThe calculation result :" + x.getCircle());
                        break;
                }
            }
        }
    }
}

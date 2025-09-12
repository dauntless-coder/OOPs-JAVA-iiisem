<<<<<<< HEAD
import java.util.Scanner;

public class Swap02 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take input
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Before swapping: a = " + a + ", b = " + b);

            // Swap without temp variable
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swapping: a = " + a + ", b = " + b);

            sc.close();
        }
    }


=======
import java.util.Scanner;

public class Swap02 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take input
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Before swapping: a = " + a + ", b = " + b);

            // Swap without temp variable
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swapping: a = " + a + ", b = " + b);

            sc.close();
        }
    }


>>>>>>> f2972f1b7d14ee643501fb01885d78b9d852bad9

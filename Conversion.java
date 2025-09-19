import java.util.Scanner;

public class Conversion {
    // read a number in metre and convert to feet and display the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length in metres: ");
        double metres = sc.nextDouble();
        double feet = metres * 3.28084;
        System.out.printf("%.2f metres is equal to %.2f feet%n", metres, feet);


    }
}


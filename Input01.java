import java.util.Scanner;

public class Input01 {
    //take input from user
    public static void main(String [] args){
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);

    }
}

import java.util.Scanner;
class TryCatch{


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a, b, c;

        System.out.println("First no.");

        a=sc.nextInt();


        System.out.println("Second no.");


        b=sc.nextInt();

        try{


            c=a/b;


            System.out.println("result= "+ c);
        }
        catch(Exception e){
            System.out.println("problem in divide");

        }
        System.out.println("some other work");





    }
}
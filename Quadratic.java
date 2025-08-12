public class Quadratic {
   /* WAP that print all real solutions to the quadratic equation ax^2 + bx +c = 0 , read-in abc and use the quadratic formula.
if the discriminat b^2-4ac is -ve then display a mssg stating that there are no real solutions.*/
    public static void main(String[] args) {
         java.util.Scanner sc = new java.util.Scanner(System.in);

         System.out.print("Enter coefficient a: ");
         double a = sc.nextDouble();

         System.out.print("Enter coefficient b: ");
         double b = sc.nextDouble();

         System.out.print("Enter coefficient c: ");
         double c = sc.nextDouble();

         // Calculate the discriminant
         double discriminant = b * b - 4 * a * c;

         if (discriminant < 0) {
              System.out.println("There are no real solutions.");
         } else {
              // Calculate the two real solutions
              double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
              double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

              System.out.printf("The real solutions are: %.2f and %.2f%n", root1, root2);
         }
    }

}

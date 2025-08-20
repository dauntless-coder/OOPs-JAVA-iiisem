public class EvenOdd {
    //check even odd without modulus operator
    public static void main(String[] args) {
        int number = 10; // Example number
        if ((number & 1) == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }


}

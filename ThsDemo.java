<<<<<<< HEAD
public class ThsDemo {

    int a, b;
    //class variables
    public void get(int a, int b) {
        //x and y get func ke local variables
     this.a = a;
     this.b = b;

    }
    public void put (){
        System.out.println("a = "+a+" b = "+b);

    }
}
class Demo{
    public static void main(String[] args) {
        ThsDemo ob1 = new ThsDemo();
        ob1.get(10, 20);
        ob1.put();
    }
}
=======
public class ThsDemo {

    int a, b;
    //class variables
    public void get(int a, int b) {
        //x and y get func ke local variables
     this.a = a;
     this.b = b;

    }
    public void put (){
        System.out.println("a = "+a+" b = "+b);

    }
}
class Demo{
    public static void main(String[] args) {
        ThsDemo ob1 = new ThsDemo();
        ob1.get(10, 20);
        ob1.put();
    }
}
>>>>>>> f2972f1b7d14ee643501fb01885d78b9d852bad9

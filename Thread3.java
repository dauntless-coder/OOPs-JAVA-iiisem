public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("Surabhi Thread");	
	System.out.println(t);
    }
}

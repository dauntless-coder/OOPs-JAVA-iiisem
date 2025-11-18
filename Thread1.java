class MyThread extends Thread
 {
    public void run() {
        System.out.println("Thread running using Thread class");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // create thread object
        t1.start(); // start the thread
        System.out.println("Main thread");
    }
 }

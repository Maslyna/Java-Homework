package multithreading;

public class Main {
    public static void main(String[] args) throws Exception {
        Thread t1 = new MyThread1(1, 0);
        Thread t2 = new MyThread2(2, 0);
        t1.start();
        t2.start();
        // t1.join();
        // t2.join();
        Thread t3 = Thread.currentThread();
        System.out.println(t3.getId());
        System.out.println(t1.getId());
        System.out.println(t2.getId());
        System.out.println("Thread main");

    }

}

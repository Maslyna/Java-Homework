package multithreading;

public class MyThread2 extends Thread {
    private int number;
    private int pause;

    public MyThread2(int number, int pause) {
        this.number = number;
        this.pause = pause;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            try { sleep(pause); } catch (InterruptedException e) {}
            System.out.println("Thread " + number);
        }
    }
}
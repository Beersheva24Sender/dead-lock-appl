package telran.multithreading;

public class Main {

    public static void main(String[] args) {

        Worker thread1 = new Worker();
        thread1.setName("MyThread1");
        Worker thread2 = new Worker();
        thread2.setName("MyThread2");
        thread1.start();
        thread2.start();
    }

}
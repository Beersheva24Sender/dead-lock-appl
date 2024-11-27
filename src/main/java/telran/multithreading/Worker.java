package telran.multithreading;

public class Worker extends Thread {

    private static Object mutex1 = new Object();
    private static Object mutex2 = new Object();

    static private void f1() {
        synchronized (mutex1) {
            System.out.println(Thread.currentThread().getName() + " locked mutex1");
            synchronized (mutex2) {
                System.out.println(Thread.currentThread().getName() + " locked mutex2");
            }
        }
    }

    static private void f2() {
        synchronized (mutex2) {
            System.out.println(Thread.currentThread().getName() + " locked mutex2");
            synchronized (mutex1) {
                System.out.println(Thread.currentThread().getName() + " locked mutex1");
            }
        }
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("MyThread1")) {
            f1();
        } else {
            f2();
        }
    }
    
}

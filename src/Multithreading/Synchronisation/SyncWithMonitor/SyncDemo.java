package Multithreading.Synchronisation.SyncWithMonitor;

public class SyncDemo {
    public static void main(String[] args) {

        SharedData data = new SharedData();

        MyThread1 mt1 = new MyThread1(data);
        MyThread2 mt2 = new MyThread2(data);

        mt1.start();
        mt2.start();


    }
}

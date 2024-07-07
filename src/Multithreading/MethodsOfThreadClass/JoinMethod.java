package Multithreading.MethodsOfThreadClass;

class MyMethod1 extends Thread
{
    public void run()
    {
        int count = 1;
        while (true){
            System.out.println(count++);
        }
    }
}
public class JoinMethod {
    public static void main(String[] args) {

        MyMethod1 m1 = new MyMethod1();
        m1.setDaemon(true);
        m1.start();

        Thread mainThread = Thread.currentThread();

        try {
            mainThread.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

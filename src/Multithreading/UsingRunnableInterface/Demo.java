package Multithreading.UsingRunnableInterface;

public class Demo implements Runnable {

    @Override
    public void run()
    {
        int i = 1;
        while (true){
            System.out.println("Hello");
            i++;
        }
    }

    public static void main(String[] args) {

        Demo d = new Demo();    //🔸Object of Demo interface
        Thread t = new Thread(d);   //🔸 Passing Demo object "d" inside Thread class object
        t.start();

        int i = 1;
        while (true){
            System.out.println("World");
            i++;
        }
    }
}

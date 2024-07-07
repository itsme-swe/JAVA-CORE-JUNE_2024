package Multithreading.MethodsOfThreadClass;

class Demo extends Thread
{
    public Demo(String name){
        super(name);
    }

    public void run()
    {
        int i = 1;
        while (i <= 50){
            System.out.println(i + " " + "Hello");
            try {
                Thread.sleep(100);      //1️⃣ By using sleep() method making thread slow by 100 milliseconds and sleep() method must be handled in try-catch block
            }catch (InterruptedException e){
                System.out.println(e);
            }
            i++;
        }
    }
}
public class SleepMethod {
    public static void main(String[] args) {

        Demo d = new Demo("SleepThread");

        d.start();
    }
}

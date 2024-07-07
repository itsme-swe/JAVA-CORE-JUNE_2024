package Multithreading.MethodsOfThreadClass;
class NewThread extends Thread
{
    public void run()
    {
        int i = 1;
        while (true){
            System.out.println(i + " " + "NewThread");
            i++;
        }
    }
}
public class YieldMethod {
    public static void main(String[] args) {

        NewThread nt = new NewThread();
        nt.start();

        int i = 1;
        while (true){
            System.out.println(i + " " + "MainThread");
            Thread.yield();     //1️⃣ Whichever thread will use yield() method it means it is giving priority to another thread to use more CPU time.
            i++;
        }
    }
}

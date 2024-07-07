package Multithreading.MethodsOfThreadClass;

class MyNewMethod extends Thread
{
    public void run()
    {
        int count = 1;
        while (true){
            System.out.println(count++);
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {

        MyNewMethod nm = new MyNewMethod();

        nm.setDaemon(true);
        nm.start();

        try{
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

//🔶 In this program, once the main method terminated the infinite loop will also terminate

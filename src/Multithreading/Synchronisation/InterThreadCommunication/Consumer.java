package Multithreading.Synchronisation.InterThreadCommunication;

public class Consumer extends Thread{

    SharedData data;

    public Consumer(SharedData d)
    {
        data = d;
    }

    public void run()
    {
        int value;
        while (true){
            value = data.getValue();
            System.out.println("Consumer: " + value);
        }
    }
}

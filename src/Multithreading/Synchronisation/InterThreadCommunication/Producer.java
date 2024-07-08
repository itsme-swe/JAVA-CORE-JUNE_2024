package Multithreading.Synchronisation.InterThreadCommunication;

public class Producer extends Thread{

    SharedData data;

    public Producer(SharedData d)
    {
        data = d;
    }

    public void run()
    {
        int count = 1;
        while (true){
            data.setValue(count);
            System.out.println("Producer: " + count);
            count++;
        }
    }
}

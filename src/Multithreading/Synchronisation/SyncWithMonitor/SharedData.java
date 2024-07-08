package Multithreading.Synchronisation.SyncWithMonitor;

public class SharedData {

    synchronized public void display(String str)
    {
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
        }
    }
}

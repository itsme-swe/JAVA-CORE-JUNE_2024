package Multithreading.Synchronisation.SyncWithMonitor;

public class MyThread2 extends Thread {

    SharedData sd;      //🔸 ref. of SharedData Class

    public MyThread2(SharedData d){
        this.sd = d;
    }

    @Override
    public void run()
    {
        sd.display("Welcome All");
    }
}

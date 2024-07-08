package Multithreading.Synchronisation.SyncWithMonitor;

public class MyThread1 extends Thread {

    SharedData sd;      //🔸 ref. of SharedData Class

    public MyThread1(SharedData d){
        this.sd = d;
    }

    @Override
    public void run()
    {
        sd.display("Hello World");
    }

}

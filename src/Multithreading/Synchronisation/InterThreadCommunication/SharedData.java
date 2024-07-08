package Multithreading.Synchronisation.InterThreadCommunication;

public class SharedData {

    int value;
    boolean flag = true;

   synchronized public void setValue(int v)
    {
        while (!flag)   //🔸 if flag is false
            try {
                wait();
            }catch (Exception e){
                System.out.println(e);
            }
        value = v;
        flag = false;
        notify();
    }

    synchronized public int getValue()
    {
        int x = 0;

        //🔸 if flag is true
        while (flag){
            try {
                wait();
            }catch (Exception e){
                System.out.println(e);
            }
        }
        x = value;
        flag = true;
        notify();

        return x;
    }
}

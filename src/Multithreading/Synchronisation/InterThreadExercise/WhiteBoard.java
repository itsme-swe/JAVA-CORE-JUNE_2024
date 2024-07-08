package Multithreading.Synchronisation.InterThreadExercise;

public class WhiteBoard {

    String text;
    int numOfStudents = 0;
    int count = 0;

    public void attendance()
    {
        numOfStudents++;
    }

    synchronized public void write(String t)
    {
        System.out.println("Teacher is writing " + t);
        while (count!= 0)
        {
            try {
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }

        }
        text = t;
        count = numOfStudents;
        notifyAll();
    }

    synchronized public String read()
    {
        while (count == 0)
        {
            try {
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }

        String t = text;
        count--;
        if (count == 0){
            notify();
        }
        return t;

    }

}

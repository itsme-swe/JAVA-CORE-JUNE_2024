package Multithreading.Synchronisation.InterThreadExercise;

public class Teacher extends Thread {

    WhiteBoard wb;

    String[] notes = {"Java is Language", "It is OOPs", "It is platform independent", "It support multithreading", "end"};

    public Teacher(WhiteBoard w)
    {
        wb = w;
    }

    public void run()
    {
        for (int i = 0; i < notes.length; i++){
            wb.write(notes[i]);
        }
    }
}

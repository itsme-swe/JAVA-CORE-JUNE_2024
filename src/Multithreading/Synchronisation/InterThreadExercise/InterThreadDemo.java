package Multithreading.Synchronisation.InterThreadExercise;

public class InterThreadDemo {
    public static void main(String[] args) {

        WhiteBoard wb = new WhiteBoard();

        Teacher t = new Teacher(wb);

        Student s1 = new Student("1. John", wb);
        Student s2 = new Student("2. Ajay", wb);
        Student s3 = new Student("3. Harsh", wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
    };
}

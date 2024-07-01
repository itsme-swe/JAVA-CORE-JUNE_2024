package ObjectOrientedProgramming.ArrayOfObjects;

public class ArrayOfObjectsDemo {
    public static void main(String[] args) {

        SubjectClass [] subs = new SubjectClass[3];

        subs[0] = new SubjectClass("s101", "DS", 100);
        subs[1] = new SubjectClass("s103", "SAD", 100);
        subs[2] = new SubjectClass("s105", "Networking", 100);

        for (SubjectClass s : subs){
            System.out.println(s);
        }

    }
}

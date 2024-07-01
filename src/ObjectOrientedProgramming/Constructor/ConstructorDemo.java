package ObjectOrientedProgramming.Constructor;

public class ConstructorDemo {
    public static void main(String[] args) {

        //1️⃣ Object of non-parameterize constructor
        Rectangle r = new Rectangle();
        System.out.println(r.area());

        //2️⃣ Object of parameterize constructor
        Rectangle r1 = new Rectangle(10,5);
        System.out.println(r1.area());




    }
}

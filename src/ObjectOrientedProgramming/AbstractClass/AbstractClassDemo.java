package ObjectOrientedProgramming.AbstractClass;

public class AbstractClassDemo {
    public static void main(String[] args) {

        //1️⃣ Ref. of Superclass and object of Subclass.
        Super sp = new Sub();
        sp.method1();
        sp.method2();

        Sub sb = new Sub();
        sb.method1();
        sb.method2();
    }
}

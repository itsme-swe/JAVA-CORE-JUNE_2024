package ObjectOrientedProgramming.Interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {

        //1️⃣ Ref. of interface Test and Object of class "TestChild"
        Test t = new TestChild();
        t.method1();
        t.method2();

        //2️⃣ Now, to call method 3 of "TestChild" Class, we need to create ref. of that class
        TestChild tc = new TestChild();
        tc.method3();


    }
}

package ObjectOrientedProgramming.AbstractClass;

 abstract class Super {

    //1️⃣ Constructor
    public Super()
    {
        System.out.println("Super Class Constructor");
    }

    public void method1()
    {
        System.out.println("Method 1 of Super Class");
    }


    abstract void method2();
}

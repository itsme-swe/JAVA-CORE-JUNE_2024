package ObjectOrientedProgramming.Inheritance.InheritanceDemo2;

public class Child extends Parent{

    //1️⃣ Non-parameter constructor
    public Child()
    {
        System.out.println("Child Constructor");
    }

    //2️⃣ Parameter constructor
    public Child(int x)
    {
        super(x);
        System.out.println("Parameter constructor of Child class");
    }
}

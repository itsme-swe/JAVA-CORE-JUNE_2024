package ObjectOrientedProgramming.Interfaces;

public class TestChild implements Test{

    //🔸 Here method 1 and method 2 of interface "Test" has been overridden
    @Override
    public void method1()
    {
        System.out.println("Method 1 of Test Class");
    }

    @Override
    public void method2()
    {
        System.out.println("Method 2 of Test Class");
    }

    public void method3()
    {
        System.out.println("Method 3 of Test Class");
    }

}

package ObjectOrientedProgramming.Interfaces;

interface Test {

    //1️⃣ Methods of interface
    public void method1();

    public void method2();

}

/*
🔶 We cannot create objects of interfaces; we can only create references of interfaces. If a class implements an interface,
that class must provide concrete implementations for all the abstract methods of the interface. If the class does not override
all the abstract methods, it must be declared abstract.
* */

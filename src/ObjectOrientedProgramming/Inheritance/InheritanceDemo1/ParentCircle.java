package ObjectOrientedProgramming.Inheritance.InheritanceDemo1;

public class ParentCircle {

    //1️⃣ property
    public double radius;

    //2️⃣ Methods
    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

}

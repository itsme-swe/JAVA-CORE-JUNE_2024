package ObjectOrientedProgramming.Inheritance;

public class ChildCylinder extends ParentCircle {

    //1️⃣ Property
    public double height;

    //2️⃣ Method
    public double volume()
    {
        return area() * height;
    }
}

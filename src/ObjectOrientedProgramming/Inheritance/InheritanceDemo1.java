package ObjectOrientedProgramming.Inheritance;

public class InheritanceDemo1 {
    public static void main(String[] args) {

        //1️⃣ Creating an object of ChildCylinder class
        ChildCylinder c = new ChildCylinder();

        c.radius = 7;
        c.height = 10;

        System.out.println("Vol. of cylinder is " + c.volume());
        System.out.println("Area of cylinder is "+ c.area());

    }
}

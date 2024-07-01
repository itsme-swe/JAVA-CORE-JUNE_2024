package ObjectOrientedProgramming.Inheritance.InheritanceDemo3;

public class Cuboid extends Rectangle{

    int height;

    public Cuboid()
    {
        height = 1;
    }

    public Cuboid(int h)
    {
        height = h;
    }

    public Cuboid(int l, int b, int h)
    {
        super(l,b);     // Here we are calling parameter constructor with help of super() keyword
        height = h;
    }

    public int volume()
    {
        return length * breadth * height;
    }
}

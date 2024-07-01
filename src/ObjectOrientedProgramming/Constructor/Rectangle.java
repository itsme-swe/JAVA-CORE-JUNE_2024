package ObjectOrientedProgramming.Constructor;

public class Rectangle {

    private int length;
    private int breadth;

    //1️⃣ Non-parameterize constructor
    public Rectangle()
    {
        length = 1;
        breadth = 1;
    }

    //2️⃣ Parameterize constructor
    public Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int l)
    {
        length = l;
    }


    public int getBreadth()
    {
        return breadth;
    }

    public void setBreadth(int b)
    {
        breadth = b;
    }

    //3️⃣ Constructor
    public int area()
    {
        return length * breadth;
    }
}

/*
* 🔶 Constructor is the method of class which is called automatically whenever the object of the class is created.
*   -- constructor will have the same name of class name and will not have any return type not even void.
* */

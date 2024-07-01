package ObjectOrientedProgramming.DataHiding;

public class Rectangle {

    //1️⃣ We use "private" keyword to hide data from users

    private int length;
    private int breadth;

    //2️⃣ get() method and set() method
    int getLength()
    {
        return length;
    }

    void setLength(int l)
    {
        if (l > 0)
            length = l;
        else
            length = 0;
    }

    int getBreadth()
    {
        return breadth;
    }

    void setBreadth(int b)
    {
        if (b > 0)
            breadth = b;
        else
            breadth = 0;
    }

    //3️⃣ Methods cannot be private
    public int area()
    {
        return length * breadth;
    }

    public int perimeter()
    {
        return 2 * (length + breadth);
    }
}

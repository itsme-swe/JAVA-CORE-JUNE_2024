package ObjectOrientedProgramming.MethodOverriding;

class Super
{
    public void display()
    {
        System.out.println("I am Super Class");
    }
}

class Sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("I am Sub Class");
    }
}
public class OverridingDemo {
    public static void main(String[] args) {

        Super sup = new Super();
        sup.display();

        Sub sb = new Sub();
        sb.display();

        //🔸 Here we are doing Dynamic Method Dispatch --- Creating ref. of Super Class and creating an object of Subclass
        Super sup1 = new Sub();
        sup1.display();
    }
}

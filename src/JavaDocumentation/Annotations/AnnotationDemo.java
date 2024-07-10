package JavaDocumentation.Annotations;

abstract class Parent
{
    abstract public void display();
}


class Child extends Parent
{
    @Override
    public void display()
    {

    }

    @Deprecated
    public void show()
    {
        System.out.println("Hi");
    }
}
public class AnnotationDemo {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Child c1 = new Child();
        c1.show();      //🔸 if we use @Deprecated annotation on method then our compiler will give us suggestion not to use that method.
    }
}

package LambdaExpression;

@FunctionalInterface
interface MethodRef
{
    public void display(String str);
}

class LambdaDemo
{
    //🔸Constructor Parameter
    public LambdaDemo(String s)
    {
        System.out.println(s.toUpperCase());
    }
    public static void reverse(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}
public class MethodReferencesDemo {
    public static void main(String[] args) {

        MethodRef mr = System.out::println;

        mr.display("I am Method Reference");

        MethodRef mr1 = LambdaDemo::reverse;

        mr1.display("Hello");

        MethodRef mr2 = LambdaDemo::new;
        mr2.display("I am Constructor");

    }
}

package LambdaExpression;

@FunctionalInterface
interface Sayable
{
    public void say();
}

public class InstanceMethodRef {


    public void saySomething()
    {
        System.out.println("Hello, this is non-static method");
    }

    public static void main(String[] args) {

        InstanceMethodRef methodRef = new InstanceMethodRef();      //🔸creating object

        //🔸Referring non-static method using reference
        Sayable say = methodRef::saySomething;

        say.say();
    }
}

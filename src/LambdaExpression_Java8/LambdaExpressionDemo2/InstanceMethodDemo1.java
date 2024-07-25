package LambdaExpression_Java8.LambdaExpressionDemo2;

@FunctionalInterface
interface MyLambda
{
    public void display();
}

class Demo
{
    int temp = 10;      //🔸Instance Variable

    public void method1()
    {
        int count = 0;      //🔸Local Variable

        MyLambda ml = () -> {
//            int count = 0;        //»» Lambda Expression can have local variables

            System.out.println("Hi" + " " +  temp++);      //»» Lambda Expression can take instance methods and can modify them either they are final or not.

            System.out.println("Moto" + " " + count);
        };
        ml.display();

    }
}

public class InstanceMethodDemo1 {

    public static void main(String[] args) {

        Demo d = new Demo();
        d.method1();

    }
}

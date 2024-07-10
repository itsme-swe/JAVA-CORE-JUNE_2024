package LambdaExpression;

interface MyNewLambda
{
    public void display();
}

class UseLambda
{
    public void callLambda(MyNewLambda ml)
    {
        ml.display();
    }
}

class Demo
{
    public void method1()
    {
        //🔸Object of UseLambda Class
        UseLambda ul = new UseLambda();

        //🔸And, calling callLambda method and passing lambda expression as parameter
        ul.callLambda(() -> {
            System.out.println("Hello Lambda");
        });
    }
}
public class LambdaAsParameter {
    public static void main(String[] args) {

        Demo d = new Demo();

        d.method1();
    }
}

package LambdaExpression_Java8.LambdaExpressionDemo1;

@FunctionalInterface
interface MyLambda
{
    public int add(int a, int b);
}

public class TakingParameter {

    public static void main(String[] args) {

        MyLambda ml = (a,b) -> {
            return a + b;
        };

        int result = ml.add(10,10);

        System.out.println(result);
    }
}

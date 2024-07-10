package LambdaExpression;

public class MyLambdaDemo1 {
    public static void main(String[] args) {

        //1️⃣ Here we are creating an object of MyLambda and creating inner class and overriding the method
        MyLambda ml = new MyLambda(){

            public void display()
            {
                System.out.println("Hello World");
            }
        };
        ml.display();

        //2️⃣ And, here we are creating Lambda Expression
        MyLambda m2 = () -> {
            System.out.println("I am Lambda Expression");
        };
        m2.display();

        //3️⃣ Now, this object will take parameter
        LambdaTakingParameter lp = (a,b) -> a + b;

        int sumTotal = lp.add(10, 20);

        System.out.println("The sum of a + b is " + sumTotal);

    }
}

package ExceptionHandling.ArithmeticException;

public class ArithmeticError {

    public static void main(String[] args) {

        try {
            int a = 20;
            int b = 0;

            int c = a / b;

            System.out.println("Result is: " + c);

        }
        catch (ArithmeticException e){
            System.out.println("Division by Zero");
        }
    }
}

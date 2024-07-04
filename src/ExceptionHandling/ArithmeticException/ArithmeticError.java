package ExceptionHandling.ArithmeticException;

import java.util.Scanner;

public class ArithmeticError {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter the value of a: ");
        a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        b = sc.nextInt();

        try {

            c = a / b;

            System.out.print("The division of a and b is " + c);

        }
        catch (ArithmeticException e){
            System.out.println("Division by Zero " + e );
        }
    }
}

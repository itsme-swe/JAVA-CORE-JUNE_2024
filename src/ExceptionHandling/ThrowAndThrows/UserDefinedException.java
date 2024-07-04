package ExceptionHandling.ThrowAndThrows;
//1️⃣ UserDefined Exception
class NegativeException extends Exception
{
    //🔸Overriding toString() method
    public String toString(){
        return"Dimensions cannot be negative";
    }
}
public class UserDefinedException {

    static int area(int l, int b) throws Exception
    {
        if (l < 0 || b < 0)
            throw new NegativeException();
        return l * b;
    }

    static void method1() throws Exception
    {
        System.out.println("The area is " + area(-5,5));
    }

    public static void main(String[] args) {

        try {
            method1();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

package ExceptionHandling.ThrowAndThrows;

public class ThrowThrowsDemo {

    static int area(int l, int b) throws Exception
    {
        if (l < 0 || b < 0)
            throw new Exception();
        return  l * b;
    }

    static void method1()
    {
        try {
            System.out.println("Area is " + area(10, 5));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {

        method1();
    }
}

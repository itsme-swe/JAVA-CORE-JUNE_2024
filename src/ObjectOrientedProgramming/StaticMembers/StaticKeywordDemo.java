package ObjectOrientedProgramming.StaticMembers;

class Test
{

    static int x = 10;      //1️⃣ Static Variable
    int y = 20;     //2️⃣ Non-static variable


    //3️⃣ Non-Static method can access static variable
    void show()
    {
        System.out.println(x + " " + y);
    }

    //4️⃣ Static Method cannot access non-static variable
    static void display()
    {
        System.out.println(x);
    }

}
public class StaticKeywordDemo {
    public static void main(String[] args) {

        Test t1 = new Test();
        t1.show();
        t1.x = 30;
        t1.y = 40;

        Test t2 = new Test();
        t2.show();

    }
}

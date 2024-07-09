package JavaLangPackage;

enum Dept
{
    CS,IT,CIVIL,ECE;

    private Dept()
    {
        System.out.println(this.name());
    }
}
public class EnumDemo {
    public static void main(String[] args) {

        Dept d = Dept.ECE;
        System.out.println(d.ordinal());    //🔸 ordinal() method will return the index value of constants inside enum class

        Dept[] list = Dept.values();        //🔸values() will return all the constants of user-defined enum class in array
        for (Dept x : list)
        {
            System.out.print(x + " ");
        }
        //🔸Output: CS IT CIVIL ECE

        System.out.println();

        switch (d)
        {
            case CS:
                System.out.println("Head: John \nBlock: A");
                break;
            case IT:
                System.out.println("Head: Smith \nBlock: B");
                break;
            case CIVIL:
                System.out.println("Head: Harsh \nBlock: C");
                break;
            case ECE:
                System.out.println("Head: Mukul \nBlock: D");
                break;
        }

    }
}

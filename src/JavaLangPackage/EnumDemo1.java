package JavaLangPackage;

enum EngDept
{
    CS("John","Block-A"), IT("Smith","Block-B"), CIVIL("Harsh","Block-C");

    String headName;
    String block;

    private EngDept(String h, String d)
    {
        this.headName = h;
        this.block = d;
    }

    public String getHeadName(){
        return headName;
    }

    public String getBlock(){
        return block;
}
}
public class EnumDemo1 {
    public static void main(String[] args) {

        EngDept c = EngDept.CS;

        System.out.println(c.getHeadName());
        System.out.println(c.getBlock());

        /*
        🔸Output:
                    John
                    Block-A
         */

    }
}

package ObjectOrientedProgramming.Inheritance.InheritanceDemo3;

public class InheritanceDemo3 {
    public static void main(String[] args) {

        Cuboid c = new Cuboid(10);
        System.out.println(c.volume());

        Cuboid c1 = new Cuboid(2,5,5);
        System.out.println(c1.volume());

    }
}

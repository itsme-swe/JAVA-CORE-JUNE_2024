package ObjectOrientedProgramming.DataHiding;

public class DataHidingDemo1 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        r1.setLength(10);
        r1.setBreadth(20);

        System.out.println("The area of rectangle is "+ r1.area());

        System.out.println("Length of rectangle " + r1.getLength());
        System.out.println("Breadth of rectangle " + r1.getBreadth());



    }
}


/*
* 🔶 Data hiding means hiding access to the internal properties and data of an object. And, methods present in class can access these methods.
* To access these methods outside class, we need property methods (1) getter()  (2) Setter()
* 🔸getter() method to read the data.
* 🔸setter() method to write the method.
* */

package JavaLangPackage;

public class ObjectClassDemo {
    public static void main(String[] args) {

        Object o = new Object();    //1️⃣ Object of class Object

        Object o1 = new Object();

        System.out.println(o);      //2️⃣ This is by default calling to toString() method --- Output: java.lang.Object@6acbcfc0

        System.out.println(o.equals(o1));    //3️⃣ It will return false bcoz both the objects are different. It will return true when both refs. Holding the same object.

        System.out.println(o.hashCode());

    }
}

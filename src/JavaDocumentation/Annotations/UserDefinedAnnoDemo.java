package JavaDocumentation.Annotations;

@interface MyAnnotation
{

}

@MyAnnotation   //1️⃣ Class Level
public class UserDefinedAnnoDemo {
    @MyAnnotation   //2️⃣ Instance Variable Level
    int data;
    @MyAnnotation   //3️⃣ Method Level
    public static void main(@MyAnnotation String[] args) {      //4️⃣ Using with parameters

        @MyAnnotation   //5️⃣ Local Variable Level
        int x;

    }
}

/*
* 🔸Annotations can be used at Class level, method level, even we can use them with parameters
* */

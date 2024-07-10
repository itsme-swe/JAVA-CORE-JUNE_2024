package JavaDocumentation.Annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
@Documented
@interface MyAnno
{
    String name();
    String project();
    String date();
    String version() default "1.5";
}

@MyAnno(name = "Harsh", project = "Bank", date = "09/07/2024")
public class UserDefinedAnnoDemo1 {
    public static void main(String[] args) {

    }
}

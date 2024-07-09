/** @author Harsh Mehra
 * @version 2.0
 * @since 2024
 **/
package JavaDocumentation;

/** @author Harsh Mehra

 * Class for Library Book
**/

public class Book {

    /**
     * @value 10 default value
     * **/
    static int val = 10;

    /**
     * @param s BookName
     * */
    public Book(String s)
    {

    }

    /**
     * issue a book to a student
     * @param rollNo of a student
     * @throws Exception if book is not available, throws Exception
     * */
    public void issue(int rollNo) throws Exception
    {

    }

    /**
     * Check if book is available
     * @param str BookName
     * @return if book is available returns true else false
     * */
    public boolean available(String str)
    {
        return true;
    }
}

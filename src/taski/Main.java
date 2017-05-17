package taski;

/**
 * Created by jpokr on 2017-05-17.
 */
public class Main {

    public static void main(String[] args) {


        System.out.println("abc" == "abc");
        System.out.println(new String("abc").equals("abc"));
        System.out.println(new String("abc") == "abc");
        System.out.println(new String("abc") == new String("abc")); // tworzac dwa nowe obiekty bedzie false
    }
}

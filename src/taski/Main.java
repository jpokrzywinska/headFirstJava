package taski;

/**
 * Created by jpokr on 2017-05-17.
 */
public class Main {

    public static void main(String[] args) {
        ArrayOperations array = new ArrayOperations();

        int[] list = {1, 2, 3, 4,5,6,7,8,9,10,11};



        array.reverseArray(list);



        //System.out.println("abc" == "abc"); // true
        // System.out.println(new String("abc").equals("abc")); // true
        // System.out.println(new String("abc") == "abc"); // false
        //System.out.println(new String("abc") == new String("abc")); // tworzac dwa nowe obiekty bedzie false
    }
}

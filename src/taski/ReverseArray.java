package taski;

/**
 * Created by jpokr on 2017-05-17.
 */
public class ReverseArray {



    public static void main (String [] args) {
        int number = 0;
        int[] reverseArray = {1, 2, 3, 4, 50};
        reverse(reverseArray);
    }




    public static void reverse(int[] reverseArray) {
        for(int i = reverseArray.length-1; i>=0;i--){
            System.out.println(reverseArray[i]);
        }

    }
}

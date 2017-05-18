package taski;

/**
 * Created by jpokr on 2017-05-17.
 */
public class ArrayOperations {


    public static int[] reverseArray(int[] array) {

        int value;

        for (int i = 0, number = array.length - 1; i < (array.length / 2); i++, number--) {
            value = array[i];
            array[i] = array[number];
            array[number] = value;

        }
        return array;
    }


}





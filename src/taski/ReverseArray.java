package taski;

/**
 * Created by jpokr on 2017-05-17.
 */
public class ReverseArray {


    public static void main(String[] args) {
        int number = 0;

        int[] array = {1, 2, 3, 4, 50,7,53};

        reverse(array);
    }


    //todo to ma zwracać odwróconą tablice, a nie ze ty sobie wypiszesz... mozesz dodatkowa metode do wypisania, ale jak kaza zrobic metode
    //do odwracania, to znaczy ze na wyjsciu ma byc odwrócenie

    public static int[] reverse(int[] array){

        changeArray(array);
        return array;

    }

    public static void changeArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

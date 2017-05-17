package taski;

/**
 * Created by jpokr on 2017-05-17.
 */
public class ReverseArray {



    public static void main (String [] args) {
        int number = 0;
        \\todo reverseArary bedzie dopiero, gdy uzyjesz metody reverse, popraw nazwe
        int[] reverseArray = {1, 2, 3, 4, 50};
        reverse(reverseArray);
    }



    //todo to ma zwracać odwróconą tablice, a nie ze ty sobie wypiszesz... mozesz dodatkowa metode do wypisania, ale jak kaza zrobic metode
    //do odwracania, to znaczy ze na wyjsciu ma byc odwrócenie
    public static void reverse(int[] reverseArray) {
        for(int i = reverseArray.length-1; i>=0;i--){
            System.out.println(reverseArray[i]);
        }

    }
}

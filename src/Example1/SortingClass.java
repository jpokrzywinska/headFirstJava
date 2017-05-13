package Example1;

/**
 * Created by jpokr on 2017-04-03.
 */

public class SortingClass {

    // to co w nawiasie - wartosc, ktora pobieramy do naszej funkcji
    // przed nazwa metody wpisujemy typ zwracany
    public int[] selectionSort(int a[]) {

        for (int i = 0; i < a.length; i++) {
            int pomocnicza = a[i];
            int minIndeks = getMinIndeks(a, i);
            a[i] = a[minIndeks];
            a[minIndeks] = pomocnicza;
        }
        return a;
    }

    private int getMinIndeks(int a[], int z) {
        int min = a[z];
        int indeks = z;
        for (int i = z; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                indeks = i;
            }
        }
        return indeks;
    }

    public int[] bubbleSort(int a[]) {
        boolean isSorted = false;
        while (isSorted == false) {
            isSorted = true;
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] > a[i]) {
                    int pomocnicza = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = pomocnicza;
                    isSorted = false;
                }
            }
        }
        return a;
    }

    public void  displayData(int a[]){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}



package Zadania;

/**
 * Created by jpokr on 2017-05-06.
 */
public class Absolutna {

    public int solution(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {

            for (int j = i; j < A.length; j++) {
                int[] helpA = getArrayForIndexes(0, j, A);
                int[] helpB = getArrayForIndexes(j + 1, A.length, A);
                int absDiff = Math.abs(getMaxAbsValue(helpA) - getMaxAbsValue(helpB));
                if (absDiff > max)
                    max = absDiff;
            }
        }
        return max;
    }

    private int[] getArrayForIndexes(int min, int max, int[] A) {
        if (min > max)
            throw new IllegalArgumentException();
        int[] a = new int[max - min];
        for (int i = min, j = 0; i < max; i++, j++) {
            a[j] = A[i];
        }
        return a;
    }

    private int getMaxAbsValue(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (max < Math.abs(A[i])) {
                max = Math.abs(A[i]);
            }
        }
        return max;
    }
}

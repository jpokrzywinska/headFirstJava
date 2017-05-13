package Zadania;

import java.util.List;
import java.util.LinkedList;

/**
 * Created by jpokr on 2017-05-06.
 */
// you can also use imports, for example:
// import java.util.*;
import java.util.LinkedList;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Solution {
    final int LAST_VALUE=-1;

    public int solution(int[] A) {
        LinkedList<Integer> list =initializeList(A);

        for (int i = 0; i < A.length; i++) {

            if (A[i] == LAST_VALUE) {
                list.addLast(A[i]);
            }else{
                list.remove(A[i]-1);
                list.add(A[i]-1, A[i]);
            }

        }
        return list.indexOf(LAST_VALUE);
    }


    private LinkedList<Integer> initializeList(int[] A) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < A.length-1; i++) {
            list.add(0);
        }
        return list;

    }
}
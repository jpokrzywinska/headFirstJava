package javaStart.kolekcje;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by jpokr on 2017-05-16.
 */
public class IteratorTask {



    public static void main (String [] args){

        TreeMap<String, String> people = new TreeMap<>();

        people.put("Kowalski", "Jan Kowalski - 35");

        people.put("Adamiak", "Ania Adamiak - 21");
        people.put("Zaręba", "Adam Zaręba - 17");
        people.put("Piotrowski", "Karol Piotrowski - 42");
        people.put("Bobrowska", "Michalina Bobrowska - 15");

        Iterator <String> iterator = people.values().iterator();
        while (iterator.hasNext()){
            String surname = iterator.next();
            System.out.println(surname);
        }

    }
}

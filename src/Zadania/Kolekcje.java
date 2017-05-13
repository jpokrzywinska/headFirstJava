package Zadania;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by jpokr on 2017-04-30.
 */
public class Kolekcje {

    public static void main(String[] args) {


        LinkedList<String> workers = new LinkedList<>();
        workers.add("Justyna");
        workers.add("Patryk");
        workers.add("Sylwia");
        workers.add("Justyna");
        //tworzymy iteratora, ktory odwoluje sie do listy zawsze (a nie do elementu listy), dopiero wywolanie metody next() spowoduje
        // odniesienie pierwsza osobe z listy, czyli justyne
        Iterator it = workers.iterator();
        // wprowadzamy petle, dopoki iterator ma nastepnego w pamieci to wypisze nam -> czyli w tym przypadku wypisze wszystkich iteratorow
        while (it.hasNext())
            System.out.println(it.next());
        // petla for each, typ i nazwa zmiennej: przeszukuje po calej liscie workers
        for (String worker : workers) {
            System.out.println(worker + " pracuje");
        }

        // tworzymy kolekcje Set
        HashSet<String> workersSet = new HashSet<>();
        // dodajemy do naszej kolekcji wszystkie elementy z kolekcji Linkedlist
        workersSet.addAll(workers);
        // petla for each, java 8, worker- oznaczenie pojedynczego elementu z listy, na ktorym beda wykonywane operacje
        // czyli w naszym przypadku wyswietlanie na ekran calego obiektu worker(typ: String) -> nazywa sie to wyrazenie Lambda
        workersSet.stream().forEach(worker -> System.out.println(worker));


    }
}
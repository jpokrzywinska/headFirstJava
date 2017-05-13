package Dziedziczenie.Punkty;

import Dziedziczenie.FIgury.Kwadrat;
import Dziedziczenie.FIgury.Okrag;
import Dziedziczenie.FIgury.Trojkat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpokr on 2017-04-11.
 */
public class Main {
    public static void main(String[] args) {

        Punkt_1D x1 = new Punkt_1D(5);
        x1.x = 4;
        Punkt_2D x2 = new Punkt_2D(4, 8);
        x2.y = 5;
        Punkt_3D x3 = new Punkt_3D(1, 1, 1);


        List<Punkt_3D> punkty3D = new ArrayList<>();
        punkty3D.add(new Punkt_3D(2, 2, 1));
        punkty3D.add(new Punkt_3D(4, 3, 2));
        punkty3D.add(new Punkt_3D(3, 2, 5));

        for (Punkt_3D pkt : punkty3D) {
            System.out.println(pkt.odlegloscEuklidesowa(new Punkt_3D(0, 0, 0)));
        }

        //wyrażenie Lambda z javy 8 to samo co for each
        punkty3D.stream().forEach(pkt ->  System.out.println(pkt.odlegloscEuklidesowa(new Punkt_3D(0, 0, 0))));

        Okrag okrag = new Okrag(3);
        Kwadrat kwadrat = new Kwadrat(5);
        Trojkat trojkat = new Trojkat(3, 3);
//        System.out.println(kwadrat.obliczPole());
//        System.out.println(trojkat.obliczPole());
//        System.out.print(okrag.obliczPole());

    }
}


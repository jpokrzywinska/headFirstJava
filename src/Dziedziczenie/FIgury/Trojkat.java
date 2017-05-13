package Dziedziczenie.FIgury;

/**
 * Created by jpokr on 2017-04-11.
 */

public class Trojkat extends Figura {
    int a;
    int h;

    public Trojkat(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public double obliczPole() {
        return 1/2.0* a * h;
    }
}
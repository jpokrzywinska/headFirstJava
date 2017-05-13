package Dziedziczenie.FIgury;

/**
 * Created by jpokr on 2017-04-11.
 */
public class Okrag extends Figura {
    private int r;
    private final double pi = 3.14;

    public Okrag(int r) {
        this.r = r;
    }

    @Override
    public double obliczPole() {
        return pi * r * r;
    }
}


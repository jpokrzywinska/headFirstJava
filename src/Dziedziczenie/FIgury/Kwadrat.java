package Dziedziczenie.FIgury;

/**
 * Created by jpokr on 2017-04-11.
 */

public class Kwadrat extends Figura {

    private int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    @Override
    public double obliczPole() {

        return bok * bok;
    }
}


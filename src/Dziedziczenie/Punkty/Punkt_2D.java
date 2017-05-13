package Dziedziczenie.Punkty;

/**
 * Created by jpokr on 2017-04-11.
 */
public class Punkt_2D extends  Punkt_1D {

    protected int y; // protected - wszystkie klasy dziedziczace moga sie odwolac do y

    public Punkt_2D(int x,int y){
        super (x); // wywolanie konstruktora punktu1D
        this.y=y;
    }

    @Override
    public double computeDistance(Punkt_1D pkt) {
        return super.computeDistance(pkt);
    }


}

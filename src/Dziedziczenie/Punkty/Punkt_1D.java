package Dziedziczenie.Punkty;

/**
 * Created by jpokr on 2017-04-11.
 */
public class Punkt_1D implements AnalyticGeometry {
    protected int x;

    public Punkt_1D(int x) {
        this.x = x;
    }


    @Override
    public double computeDistance(Punkt_1D pkt) {
        return x - pkt.x;
    }
}
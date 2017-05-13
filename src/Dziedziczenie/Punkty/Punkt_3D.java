package Dziedziczenie.Punkty;

/**
 * Created by jpokr on 2017-04-11.
 */
public class Punkt_3D extends Punkt_2D {
    private int z;

    public Punkt_3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public double odlegloscEuklidesowa(Punkt_3D pkt3D) {

        return Math.sqrt(Math.pow(x - pkt3D.x, 2) + Math.pow(y - pkt3D.y, 2) + Math.pow(z - pkt3D.z, 2));
    }
}


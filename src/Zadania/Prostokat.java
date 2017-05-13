package Zadania;

/**
 * Created by jpokr on 2017-04-12.
 */
public class Prostokat {
    private int length;
    private int width;


    public Prostokat(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double calculateField() {
        return length * width;
    }

    public double calculateCircuit() {

        return 2 * length * width;
    }

    public double calculateDiagonal() {

        return Math.sqrt((Math.pow(length, 2) + Math.pow(width, 2)));
    }
}

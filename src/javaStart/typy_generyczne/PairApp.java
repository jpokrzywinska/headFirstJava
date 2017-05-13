package javaStart.typy_generyczne;

/**
 * Created by jpokr on 2017-05-13.
 */
public class PairApp {

    public static void main(String[] args) {
        Pair<Integer, String> a = new Pair<>(6, "hello");
        Pair<String, Double> b = new Pair<>("j", 6.88);
        Pair<Double, Character> c = new Pair<>(5.888, 'g');

        PairApp.pair(a);
        PairApp.pair(b);
        PairApp.pair(c);
    }
    static  <T,V> void pair (Pair <T,V> pair){
        System.out.println(pair.getT() + " " + pair.getV());
        System.out.println(" ");
    }
}

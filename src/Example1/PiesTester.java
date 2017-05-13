package Example1;

/**
 * Created by jpokr on 2017-03-28.
 */

class Pies {
    int wielkosc;
    String rasa;
    String nazwa;

    void szczekaj()
    {
        System.out.print("Chau! Chauuu!!");
    }
}
public class PiesTester {
    public static void main(String[] args) {
        Pies p = new Pies();
        p.wielkosc =40;
        p.szczekaj();


    }
}

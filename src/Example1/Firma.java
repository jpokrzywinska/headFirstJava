package Example1;

/**
 * Created by jpokr on 2017-04-10.
 */


public class Firma {

    public static void main(String args[])
    {
        Pracownik[] pracownicy = new Pracownik[3];
        pracownicy[0] = new Pracownik ();
        pracownicy[1] = new Pracownik ("Staszek", "Kowalski", 34);
        pracownicy[2] = new Pracownik (pracownicy[1]);

        for (Pracownik p: pracownicy)
            System.out.println("prac3: " + p.imie + " " + p.nazwisko + " " + p.wiek);
    }
}
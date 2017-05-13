package Example1;

/**
 * Created by jpokr on 2017-04-10.
 */
public class Pracownik {
    String imie;
    String nazwisko;
    int wiek;

    public Pracownik() {
        imie = "nie_podano";
        nazwisko = "nie_podano";
        wiek = -1;
    }

    public Pracownik(String i, String n, int w)
    {
        imie = i;
        nazwisko = n;
        wiek = w;
    }

    public Pracownik(Pracownik prac)
    {
        imie = prac.imie;
        nazwisko = prac.nazwisko;
        wiek = prac.wiek;
    }
}
package Example1;

public class Main {

    public static void main(String[] args) {

        SortingClass sort = new SortingClass();
        int []date={4,2,6,5,1};
        sort.bubbleSort(date);
        sort.selectionSort(date);
        sort.displayData(sort.selectionSort(date));

        Kontakt kn = new Kontakt();
        kn.telefon = 726171091;
        kn.nazwa = "Patryk";
        kn.rokUrodzenia = 1990;
        kn.wyswietlPrzynaleznosc();
        System.out.println(kn.wyliczWiek());
        Kontakt kn2 = new Kontakt();
        kn2.telefon = 605486004;
        kn2.nazwa = "Justyna";
        kn2.rokUrodzenia = 1993;
        kn2.wyswietlPrzynaleznosc();
        System.out.println(kn2.wyliczWiek());

        Student[] s = new Student[3];
        for (int x = 0; x < s.length; x++) {
            if (x == 0) {
                s[x] = new Student("Justyna", "Pokrzywinska", 2);
                s[x].przedstawSie();
            }
            else if (x == 1) {
                s[x] = new Student("Patryk ", "Witiw", 2);
                s[x].przedstawSie();
            }
            else {
                System.out.println("Brak studentow");
            }
        }

    }
}

class Student {
    String imie;
    String nazwisko;
    int rokStudiow;

    public Student(String imie, String nazwisko, int rokStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokStudiow = rokStudiow;
    }

    public Student() {

    }

    public void przedstawSie() {
        System.out.print("Example1.Student nazywa sie " + imie + " " + nazwisko + " i jest na " + rokStudiow + " roku studiow ");
        System.out.println(" ");
    }

    public boolean czyPatryk() {
        return imie == "patryk";
    }
}

class Kontakt {
    public long telefon;
    String nazwa;
    int rokUrodzenia;

    public void wyswietlPrzynaleznosc() {
        System.out.println("Ten telefon nalezy do " + nazwa + " i ma numer " + telefon);
    }

    public int wyliczWiek() {
        return 2017 - rokUrodzenia;
    }

}

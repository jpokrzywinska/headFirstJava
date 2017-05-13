package javaStart;

/**
 * Created by jpokr on 2017-05-08.
 */
public class Student {
    public String imie;
    private Rok rok;
    public String nazwisko;
    public int nrIndeksu;
    public static int iloscStudentow = 0;

    public Rok getRok(){
        return rok;
    }
    public void setRok(Rok rok){
        this.rok=rok;

    }

     public Student() {
        iloscStudentow++;
    }
}


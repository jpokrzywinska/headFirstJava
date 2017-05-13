package javaStart;

/**
 * Created by jpokr on 2017-05-08.
 */
public class Univeristy {
    public static void main(String[] args) {
        Student justyna = new Student();
        Student patryk = new Student();

        Student sylwia = new Student();

        System.out.println("ilosc studentow to: " + Student.iloscStudentow);
        justyna.setRok(Rok.PIERWSZY);
        System.out.println(justyna.getRok());
        System.out.println(justyna.getRok().getOpis());

        for (Rok r : Rok.values()) {
            System.out.println("dostepne roczniki to: " + r.getOpis());
        }
        sylwia.setRok(Rok.DRUGI);
        System.out.println(sylwia.getRok().getOpis());

    }
}

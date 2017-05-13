package javaStart;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Created by jpokr on 2017-05-09.
 */
public class HospitalApp {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Maciek", "Prefeska", 7500, 1300));
        hospital.add(new Nurse("Ania", "Dobroszewska", 2200, 6));
        hospital.add(new Nurse("Marta", "Danielska", 2100, 3));

        System.out.println("Pracownicy szpitala: ");
        System.out.println(hospital);


        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[2];
        boolean error = true;

        while (error) {
            try {
                System.out.println("Podaj 1 liczbę: ");
                numbers[0] = sc.nextInt();
                sc.nextLine();
                System.out.println("Podaj 2 liczbę: ");
                numbers[1] = sc.nextInt();


                System.out.println("Którą wartość wyświetlić (1 lub 2)? ");
                System.out.println(numbers[sc.nextInt() - 1]);
                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Nie podałeś liczby całkowitej, spróbuj jeszcze raz: ");

            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Miało być 1 lub 2, zacznijmy od nowa: ");
                ex.printStackTrace();

            }
        }
        sc.close();
    }


}
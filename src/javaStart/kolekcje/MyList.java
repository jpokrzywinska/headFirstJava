package javaStart.kolekcje;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

/**
 * Created by jpokr on 2017-05-14.
 */
public class MyList {
    private static final String EXIT_COMMAND = "exit";

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.run();

    }

    public void run() {

        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new LinkedList();
        System.out.println("podaj liczby, ktore chcesz zsumowac");
        boolean finish = false;
        LinkedList<Integer> test = new LinkedList<>();

        while (!finish) {
            try {
                if (scanner.hasNextInt()) {
                    lista.add(scanner.nextInt());
                } else if (EXIT_COMMAND.equals(scanner.next()))
                    finish = true;
                else
                    System.out.println("Niepoprawna wartość");
            } catch (Exception ex) {
            }
        }
        printList(lista);
        printEquation(lista);

    }

    private void printList(List<Integer> list) {
        System.out.println(list);
    }

    private void printEquation(List<Integer> list) {
        int wynik = 0;
        StringBuilder sb = new StringBuilder();
        for (Integer elem : list) {
            sb.append(elem);
            sb.append("+");
            wynik += elem;
        }
        sb.replace(sb.length()-1, sb.length(),"=");
        sb.append(wynik);
        System.out.println(sb);
    }

}


package Zadania;

import javax.swing.*;
import java.util.*;

/**
 * Created by jpokr on 2017-05-05.
 */
public class Zad1 {
public static int value =4;
    public static void main(String[] args) {
        List<String> friends = new ArrayList<String>();
        friends.add("Zosia");
        friends.add("Basia");
        friends.add("Zygmunt");
        friends.add("Piotr");


        for (String name : friends)
            System.out.println("znajomy to " + name);

        // Map jest interfejsem, a HashMap klasa, ktora implementuje Map
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Witam","hello");
        dictionary.put("imie","name");
        dictionary.put("pies","dog");
        dictionary.put("kot","cat");
        dictionary.put("pensja","salary");
       //System.out.println("Podaj wyraz po polsku");
      String polishWord= JOptionPane.showInputDialog(null,"Podaj slowo po polsku");
       // Scanner scanner = new Scanner(System.in);
       //String polishWord =scanner.next();
        polishWord = polishWord.trim();
        if(dictionary.containsKey(polishWord)){
           JOptionPane.showMessageDialog(null,"Slowo po ang to: "+dictionary.get(polishWord));
          // System.out.println("Słowo po angielsku to: "+dictionary.get(polishWord));
        }
        else{
            JOptionPane.showMessageDialog(null,"Nie znaleziono slowa w slowniku");
         //  System.out.println("Nie znaleziono slowa w slowniku");
        }

        Random random =new Random();
        Set<Integer> numbers= new HashSet<>();

        //losuje liczy od 0 do bound-1, wiec dodajemy +1
        // 0 do bound-1
        //(0 do 48)+1
        //1+49
        while (numbers.size()!=6){
            numbers.add(1+random.nextInt(49));
        }
        System.out.println("Wylosowane liczby to: "+numbers);
        //for(int i=1;i<=6;i++)
          //  System.out.println(1+random.nextInt(49));



    }
}

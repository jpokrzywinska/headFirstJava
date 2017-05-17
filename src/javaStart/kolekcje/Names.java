package javaStart.kolekcje;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Comparator;

public class Names {

    public static void main(String[] args) {
        readFile();



    }




    public static void readFile(){
        TreeSet<String> list = new TreeSet<>();
        String fileName = "namespl.txt";
        FileReader fileReader = null;
        BufferedReader reader = null;
        try {
            fileReader = new FileReader(fileName);
            reader = new BufferedReader(fileReader);
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                list.add(nextLine);
               lines++;
            }
            System.out.println("Ilość wierszy w pliku: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.first());
        System.out.println(list.last());

    }


}





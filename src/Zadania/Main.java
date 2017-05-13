package Zadania;

/**
 * Created by jpokr on 2017-04-12.
 */
public class Main {
    public static void main(String[] args) {

        Main a = new Main();
        a.liczbyOd0doX(3);
        a.liczbyOd0doX2(4);

        Prostokat prostokat = new Prostokat(4,5);
        prostokat.calculateCircuit();
    }
    public String[] alfabet() {
        String[] alf = new String[5];
        alf[0] = "a";
        alf[1] = "b";
        alf[2] = "c";
        alf[3] = "d";
        alf[4] = "e";
        return alf;
    }

    int number;

    public void liczbyOd0doX(int a) {
        number = a;

        for (int i = 0; i <= a; i++) {
            System.out.println(i);
        }
    }

    public void liczbyOd0doX2(int a){
        number=a;
        int i=0;
        while( i<=a){
            System.out.println(i);
            i++;

        }
    }
}



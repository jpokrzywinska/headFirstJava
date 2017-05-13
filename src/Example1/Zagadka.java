package Example1;

import CiagFib.Ciag;

/**
 * Created by jpokr on 2017-04-01.
 */
public class Zagadka {
    public static void main(String[]args){
        Zagadka4[]obty=new Zagadka4[6];
        int y=1;
        int x=0;
        int wynik=0;
        Ciag f=new Ciag();
        f.setX(3);
        System.out.println(f.getX());
        System.out.println(f.fibonacciSequence(10));


        while(x<6){
            obty[x]=new Zagadka4();
            obty[x].izm=y;
            y=y*10;
            x=x+1;

        }
        x=6;
        while(x>0){
            x=x-1;
            wynik=wynik+ obty[x].zrobCos(x);

        }
        System.out.println("wynik "+wynik);

    }
}
 class Zagadka4{
    int izm;
    public int zrobCos(int czynnik)
    {
        if(izm>100){
            return izm*czynnik;
        }else{
            return izm*(5-czynnik);
        }
    }
 }

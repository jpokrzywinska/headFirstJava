package Zadania;

/**
 * Created by jpokr on 2017-04-12.
 */
public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


    public boolean isOdd() {
        return number % 2 == 1;
    }

    public boolean isEven() {
        return !isOdd();
    }

    public double sqrt() {
        return Math.sqrt(number);
    }

    public int pow(MyNumber myNumber) {
        //return Math.pow(number, a);
        int iloczyn = 1;
        for (int i = 0; i < myNumber.getNumber(); i++) {
            iloczyn *= number;// => iloczyn = iloczyn*number;
        }
        return iloczyn;
    }
    public int add(MyNumber a){
        return number + a.getNumber();
    }


}

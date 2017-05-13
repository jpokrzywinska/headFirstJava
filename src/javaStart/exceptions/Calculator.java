package javaStart.exceptions;

import javaStart.UnkownOperatorException;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.math.BigDecimal;

/**
 * Created by jpokr on 2017-05-10.
 */
public class Calculator {

    static final String PLUS ="+";
    static final String MINUS ="-";
    static final String MULTIPLY ="*";
    static final String DIVIDE ="/";



    public static void main(String[] args) {
        Calculator gm = new Calculator();
        gm.print5Times(2);
        gm.print5Times("Krzysio");




        boolean correct = false;
        Calculator calc = new Calculator();
        double odpowiedz;
        double value1=0.0;
        double value2=0.0;
        String operation=null;
        while (!correct) {
            try {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj 1 liczbe: ");
                value1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Podaj 2 liczbe: ");
                value2 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("wybierz dzialanie: + - * /");
                operation = scanner.next();
                odpowiedz = calc.selectOperation(value1, value2, operation);
                System.out.println("wynik: " + odpowiedz);

                correct = true;

            } catch (ArithmeticException ex) {
                ex.printStackTrace();
            } catch (InputMismatchException ex) {
                System.out.println("podaj liczbe calkowita");
            } catch (UnkownOperatorException ex) {
                ex.printStackTrace();
            }
        }

    }

    public double selectOperation(double value1, double value2, String operation) throws UnkownOperatorException, ArithmeticException {

        double wynik = 0;
        switch (operation) {
            case PLUS:
                wynik = value1 + value2;
                break;
            case MINUS:
                wynik = value1 - value2;
                break;
            case MULTIPLY:
                wynik = value1 * value2;
                break;
            case DIVIDE:
                if(value2==0){
                    throw new ArithmeticException("nie mozesz dzielic przez 0");
                }
                wynik = value1 / value2;
                break;
            default:
                throw new UnkownOperatorException("tylko: + - * /");

        }

        return wynik;

    }
    public <T> void print5Times(T arg) {
        for (int i = 0; i < 5; i++)
            System.out.println(arg);
        double a = 0.7;
        double b = 0.3;
        System.out.println("a - b = " + (a - b));
    }
}


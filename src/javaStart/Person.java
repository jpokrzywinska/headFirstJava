package javaStart;

/**
 * Created by jpokr on 2017-05-09.
 */
public class Person {

    private String name;
    private String surname;
    private double salary;
    public String toString(){
        return "imie: "+name+ ", nazwisko: " + surname+ ", wynagrodzenie: " + salary+ " zl";
    }

    public Person (String name, String surname, double salary){
        setName(name);
        setSurname(surname);
        setSalary(salary);
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

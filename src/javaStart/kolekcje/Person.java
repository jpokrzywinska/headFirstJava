package javaStart.kolekcje;

/**
 * Created by jpokr on 2017-05-16.
 */
public class Person {
    private String name;
    private String surname;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String surname, int wiek){
        setName(name);
        setSurname(surname);
        setAge(age);

    }
}

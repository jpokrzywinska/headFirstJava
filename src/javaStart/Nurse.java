package javaStart;

/**
 * Created by jpokr on 2017-05-09.
 */
public class Nurse extends Person {

    private double overtime;

    public Nurse(String name, String surname, double salary, double overtime ){
        super (name, surname, salary);
        setOvertime(overtime);

    } public String toString(){
        return super.toString()+ ", nadgodziny: "+overtime;
    }
    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }
}

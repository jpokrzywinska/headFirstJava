package javaStart;

/**
 * Created by jpokr on 2017-05-09.
 */
public class Doctor extends Person {
    private double bonus;

    Doctor (String name, String surname, double salary, double bonus){
        super(name, surname, salary);
        setBonus(bonus);
    }
    public String toString(){
        return super.toString() + " bonus: "+bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }


}

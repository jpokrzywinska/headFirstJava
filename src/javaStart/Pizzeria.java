package javaStart;

/**
 * Created by jpokr on 2017-05-09.
 */
public class Pizzeria {
    private Pizza pizza;

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public static void main(String[] args) {
        for (Pizza pizza : Pizza.values()) {
            System.out.println("mozliwe pizze do wyboru: " + pizza.getPizza());
        }
        Pizzeria tomek = new Pizzeria();
        tomek.setPizza(Pizza.CAPRICIOSA);
        System.out.println("tomek wybral: " + tomek.getPizza());
        System.out.println("tomek wybral: " + tomek.getPizza().getPizza());
    }
}


package CiagFib;

/**
 * Created by jpokr on 2017-04-01.
 */
public class Ciag {
   private int x=4;
    public static void main(String[] args) {


        Ciag fibonacci = new Ciag();

        try {

            System.out.println(fibonacci.fibonacciSequence(10));

        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println("Jestem w catchu");

        }
        catch (Exception e){
            e.printStackTrace(); // wiele catch stosujemy jak chcemy na rozne wyjatki inaczej reagowac
        }
        finally {
            System.out.println("Jestem w finally");
        }
        System.out.println(fibonacci.fibonacciSequence(12));
    }

    public int fibonacciSequence(Integer number)throws IllegalArgumentException,NullPointerException {
        int result = 0;
        int beforeLast = 0;
        int last = 0;
        if(number<0)
        throw new IllegalArgumentException("Zly argument: "+number);

        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                result = 0;
            } else if (i == 1) {
                result = 1;

            } else {
                result = beforeLast + last;
            }
            beforeLast = last;
            last = result;
        }
        return result;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
       this.x=x;
    }

}



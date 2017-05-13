package Example1;

/**
 * Created by jpokr on 2017-04-01.
 */
public class XCopy {
    public static void main(String[] args){
        int org=42;
        XCopy x =new XCopy();
        int y = x.jazda(org);
        System.out.println(org+ " "+ y);

    }
    int jazda (int arg){
        arg=arg*2;
        return arg;

    }
}

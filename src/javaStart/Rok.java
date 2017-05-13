package javaStart;

/**
 * Created by jpokr on 2017-05-09.
 */
public enum Rok {
    PIERWSZY("lala"), DRUGI("2"), TRZECI("3");

    private String opis;
    private Rok( String desc){
        opis=desc;
    }
    public String getOpis (){
        return opis;
    }


}

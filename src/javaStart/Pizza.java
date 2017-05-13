package javaStart;

/**
 * Created by jpokr on 2017-05-09.
 */enum Pizza {
     MARGHERITA("sos pomidorowy+ser"),
    CAPRICIOSA ("sos pomidorowy + ser + pieczarki"),
    PROSCIUTO ("sos pomidorowy + ser + szynka");

     private String description;
     private Pizza (String description){
         this.description=description;
     }
     public String getPizza () {
         return description;
    }
}

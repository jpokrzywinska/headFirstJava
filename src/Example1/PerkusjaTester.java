package Example1;

/**
 * Created by jpokr on 2017-03-28.
 */
class Perkusja {
    boolean talerze = true;
    boolean beben = true;
    void zagrajNaBebnie () {
        System.out.println("bam bam, baaam, baaam");
    }
    void nagrajNaTalerzach() {
        System.out.println("brzek brzek");
    }
}
public class PerkusjaTester {
    public static void main(String[] args) {
        Perkusja p = new Perkusja ();

        p.zagrajNaBebnie();
         p.beben = false;
        p.nagrajNaTalerzach();

        if (p.beben == true) {
            p.zagrajNaBebnie();
        }

        }
    }


package gra;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jpokr on 2017-04-29.
 */
public class GameTest {
    Game game = new Game();

    @Test
    public void testMakeAMove() {
        game.makeAMove("Kolko", 2, 2);
        Assert.assertEquals("Kolko", game.getBoard()[2][2]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMakeAMoveIncorrectSymbol() {
        game.makeAMove("Kryzyk",1,2);
    }
    @Test (expected =IllegalArgumentException.class)
    public void testMakeAMoveIncorrectIndekx(){
        game.makeAMove("Kolko",4,2);
    }
    @Test
    public void testMakeAMoveWin(){
        game.makeAMove("Kolko",0,0);
        game.makeAMove("Kolko",0,1);
        game.makeAMove("Kolko",0,2);
        Assert.assertEquals("Kolko",game.getWinner());
    }
}

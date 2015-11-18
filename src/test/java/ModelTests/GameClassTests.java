package ModelTests;

import Model.Game;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.internal.matchers.Null;

import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-13.
 *
 * All tests for the game class goes in here.
 * I do not test the setter methods
 */
public class GameClassTests {

    private static Game game;

    @BeforeClass
    public static void setUp() {
        game = new Game();
    }

    @Test
    public void gameConstructorShouldSetDefaultDifficulty() {
        assertEquals(1, game.getDifficulty());

    }

    @Test
    public void gameConstructorSetsScoreToZero() {
        assertEquals(0, game.getScore());
    }

    @Test
    public void gameConstructorInstanciatesQuestion() {
        game.getQuestion().getOperator();   //Just doing some method to check if its instanciated
    }
}

import junit.framework.Assert;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-13.
 *
 * All tests for the game class goes in here. I will not be testing getters and setters
 */
public class GameClassTests {

    private static Game game;

    @Test
    public void gameConstructorShouldSetDefaultDifficulty() {
        game = new Game();
        assertEquals(1, game.difficulty);

    }





}

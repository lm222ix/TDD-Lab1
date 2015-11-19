package ControllerTests;

import Controller.GameController;
import Model.Game;
import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.Assert.*;
/**
 * Created by Ludde on 2015-11-19.
 */
public class GameControllerConstructorTests {

    private static Game game;
    private static IView view;
    private static GameController gc;

    @BeforeClass
    public static void setUp() {
        game = new Game();
        view = new StandardView(new Printer());
    }

    @Test
    public void gameOrViewNotNull() {
        gc = new GameController(game, view);
        assertNotNull(gc.game);
        assertNotNull(gc.view);
    }

}

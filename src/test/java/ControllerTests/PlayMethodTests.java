package ControllerTests;

import Controller.GameController;
import Model.Game;
import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-19.
 */
public class PlayMethodTests {

    private static GameController gc;
    private static IView view;
    private static Game game;

    private byte[] command;

    @BeforeClass
    public static void setUp() {
        game = new Game();
        view = new StandardView(new Printer());
        gc = new GameController(game,view);
    }

    @Test
    public void PlayReturnsFalseOnlyIfUserQuit() {
        command = "P".getBytes();
        InputStream inputStream = new ByteArrayInputStream(command);
        System.setIn(inputStream);
        assertTrue(gc.play());
        command = "Q".getBytes();
        inputStream = new ByteArrayInputStream(command);
        System.setIn(inputStream);
        assertFalse(gc.play());



    }
}

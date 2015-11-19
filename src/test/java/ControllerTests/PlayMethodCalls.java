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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by Ludde on 2015-11-19.
 */
public class PlayMethodCalls {

    private static GameController gc;
    private static IView view;
    private static Game game;

    private byte[] command;

    @BeforeClass
    public static void setUp() {
        game = new Game();
        view = new StandardView(new Printer());
        gc = mock(GameController.class);

    }

    @Test
    public void PlayCallsNewGameIfInputIsP() {
        gc = mock(GameController.class);
        command = "Q".getBytes();
        InputStream inputStream = new ByteArrayInputStream(command);
        System.setIn(inputStream);
        gc.play();
        verify(gc, times(1)).newGame();

    }
}

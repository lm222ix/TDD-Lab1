package ControllerTests.PlayMethodTests;

import Controller.GameController;
import Model.Game;
import Model.Question;
import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.mockito.Mockito.*;

/**
 * Created by Ludde on 2015-11-19.
 */
public class PlayMethodCallsDisplaySettingsOnInputS {

    private static GameController gc;
    private static IView view;
    private static Game game;

    private byte[] command;

    @BeforeClass
    public static void setUp() {
        game = new Game();
        view = new StandardView(new Printer());
        gc = spy(new GameController(game,view, new Question()));

        //Fixes errors introduces by the displaySettings test
        doNothing().when(gc).displaySettings();
    }

    @Test
    public void PlayCallsDisplaySettingsOnInputS() {
        command = "S".getBytes();
        InputStream inputStream = new ByteArrayInputStream(command);
        System.setIn(inputStream);
        gc.play();
        verify(gc, times(1)).displaySettings();
    }

}

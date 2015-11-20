package ControllerTests.PlayMethodTests.DisplaySettingsTests;

import Controller.GameController;
import Model.Game;
import Model.Question;
import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static junit.framework.Assert.*;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.verification.*;
import org.mockito.Mock.*;
import org.mockito.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Created by Ludde on 2015-11-19.
 */
public class DisplaySettigsCallsCorrectMethods {

    private static IView view;
    private static Game game;
    private static GameController gc;
    private static Question q;

    @BeforeClass
    public static void setUp() {
        view = mock(StandardView.class);
        game = mock(Game.class);
        q = new Question();
        gc = new GameController(game,view,q);

        //When setDiff is called call it with (1) parameter.
        Mockito.doCallRealMethod().when(game).setDifficulty(anyInt());
        game.setDifficulty(2);



        when(view.getAnswer()).thenReturn(2);
    }


    @Test
    public void displaySettingsCallsCorrectMethods() {
        gc.displaySettings();
        verify(view, times(1)).displayEditSettingsMenu();
        verify(view,times(1)).getAnswer();
        verify(gc.game, times(2)).setDifficulty(2);
    }



}

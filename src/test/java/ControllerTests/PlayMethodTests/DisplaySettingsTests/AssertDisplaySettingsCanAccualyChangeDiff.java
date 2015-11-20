package ControllerTests.PlayMethodTests.DisplaySettingsTests;

import Controller.GameController;
import Model.Game;
import Model.Question;
import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Ludde on 2015-11-20.
 */
public class AssertDisplaySettingsCanAccualyChangeDiff {

    private static IView view;
    private static Game game;
    private static Question q;
    private static GameController gc;


    @BeforeClass
    public static void setUp() {
        game = new Game();
        q = new Question();
        view = mock(StandardView.class);
        gc = new GameController(game,view,q);

        when(view.getAnswer()).thenReturn(2);
    }

    @Test
    public void assertDiffIsChanged() {
        assertEquals(1, game.getDifficulty());
        gc.displaySettings();
        assertEquals(2,game.getDifficulty());
    }
}

package ControllerTests;

import Controller.GameController;
import Model.Game;
import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-19.
 */
public class NewGameMethodTests {


    private static IView view;
    private static Game game;
    private static GameController gc;


    @BeforeClass
    public static void setUp() {
        view = new StandardView(new Printer());
        game = spy(new Game());
        gc = spy(new GameController(game,view));

    }

    @Before
    public void before() {
        gc.newGame();
    }


    @Test
    public void newGameResetsScore() {
        verify(game, times(1)).setScore(0);
    }









}

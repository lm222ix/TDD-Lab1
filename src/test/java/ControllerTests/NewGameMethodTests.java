package ControllerTests;

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
import org.mockito.verification.*;
import org.mockito.Mock.*;
import org.mockito.*;

/**
 * Created by Ludde on 2015-11-19.
 */
public class NewGameMethodTests {


    private static IView view;
    private static Game game;
    private static GameController gc;
    private static Question q;

    @BeforeClass
    public static void setUp() {
        view = spy(new StandardView(new Printer()));
        game = spy(new Game());
        q = spy(new Question());
        gc = spy(new GameController(game,view,q));
    }


    @Test
    public void newGameCallsMethodsInOrder() {
        gc.newGame();

        InOrder inOrder = inOrder(game, q, view);

        inOrder.verify(game, times(1)).setScore(0);
        verify(q, times(10)).makeNewQuestion(game.getDifficulty());
        verify(view, times(10)).displayQuestion(gc.question);
    }








}

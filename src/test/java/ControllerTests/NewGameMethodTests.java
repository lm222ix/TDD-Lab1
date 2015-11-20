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

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Created by Ludde on 2015-11-19.
 */
public class NewGameMethodTests {


    private static IView view;
    private static Game game;
    private static GameController gc;
    private static Question q;
    private static byte[] command;

    @BeforeClass
    public static void setUp() {
        //view = spy(new StandardView(new Printer()));
        view = mock(StandardView.class);
        game = spy(new Game());
        q = spy(new Question());
        gc = spy(new GameController(game,view,q));

        //Change the answer to the correct one for each question

        when(view.getAnswer()).thenReturn(9001);     //this can never be the answer
    }


    @Test
    public void newGameCallsMethodsInOrder() {
        gc.newGame();

        InOrder inOrder = inOrder(game, q);
        inOrder.verify(game, times(1)).setScore(0);
        verify(q, times(10)).makeNewQuestion(game.getDifficulty());
        verify(view, times(10)).displayQuestion(gc.question);
        verify(view,times(10)).getAnswer();                         //Wait for user input 10 times
        verify(q, times(10)).getAnswer();                       //Check user response against accual answer 10 times
        verify(view,times(10)).printRightOrWrong(false);    //Print right/wrong 10 times, in this case 10 wrongs
    }

}

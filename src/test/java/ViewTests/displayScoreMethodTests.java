package ViewTests;

import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by Ludde on 2015-11-18.
 */
public class displayScoreMethodTests {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private static IView view;
    private Printer printer;
    private String message;
    private int score;

    @Before
    public void setUp() {
        printer = mock(Printer.class);
        view = new StandardView(printer);
        System.setOut(new PrintStream(output, true));
    }

    @Test
    public void scoreOverNineShouldPrintThatsAwesome() {
        score = 10;
        message = "Game over. Your score was: " + score + ", thats awesome!";
        view.displayResult(score);
        verify(printer, times(1)).println(message);
    }

}

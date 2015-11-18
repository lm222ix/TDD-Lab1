package ViewTests;

import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by Ludde on 2015-11-18.
 */
public class printRightOrWrongMethodTests {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private static IView view;
    private Printer printer;
    private boolean win;
    private String message;

    @Before
    public void setUp() {
        printer = mock(Printer.class);
        view = new StandardView(printer);
        System.setOut(new PrintStream(output, true));
    }

    @Test
    public void shouldPrintCorrectIfWinIsTrue() {
        message = "Correct!";
        win = true;
        view.printRightOrWrong(win);
        verify(printer, times(1)).println(message);
    }

    @Test
    public void shouldPrintWrongIfWinIsFalse() {
        message = "Wrong!";
        win = false;
        view.printRightOrWrong(win);
        verify(printer, times(1)).println(message);
    }


}

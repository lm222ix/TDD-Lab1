package ViewTests;

import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-18.
 */
public class TestPrintMethods {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private IView view;
    private Printer printer;
    final String welcome = "Welcome to the MathGame! " +
            "This is a small game to practice doing math quickly in your head.";

    @Before
    public void setUp() {
        printer = mock(Printer.class);
        view = new StandardView(printer);
        System.setOut(new PrintStream(output, true));
    }

    @Test
    public void welcomeMessageShouldBePrintedToConsole() {
        view.displayWelcome();

        verify(printer, times(1)).println(welcome);
    }

}

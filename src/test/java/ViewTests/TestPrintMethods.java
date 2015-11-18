package ViewTests;

import View.IView;
import View.StandardView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-18.
 */
public class TestPrintMethods {

    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private IView view;
    final String welcome = "Welcome to the MathGame! " +
            "This is a small game to practice doing math quickly in your head.";
    

    @Before
    public void setUp() {
        view = new StandardView();
        System.setOut(new PrintStream(output));
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }

    @Test
    public void welcomeMessageShouldBePrintedToConsole() {
        view.displayWelcome();
        assertEquals(welcome, output.toString());
    }

}

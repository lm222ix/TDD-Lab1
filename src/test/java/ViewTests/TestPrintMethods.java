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

    final String instructions = "Change difficulties by pressing S" +
            ", or start playing by pressing P. Press Q to quit";

    final String editSettingsMessage = "Please enter 1, 2 or 3 to select difficulty. Higher is harder: ";

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

    @Test
    public void displayInstructionsShouldPrintInstructions() {
        view.displayInstructions();
        verify(printer, times(1)).println(instructions);
    }

    @Test
    public void displayEditSettingsMenu() {
        view.displayEditSettingsMenu();
        verify(printer, times(1)).println(editSettingsMessage);
    }

}

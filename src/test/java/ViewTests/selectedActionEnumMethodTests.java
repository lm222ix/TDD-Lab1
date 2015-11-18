package ViewTests;

import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Ludde on 2015-11-18.
 */
public class selectedActionEnumMethodTests {
    private static IView view;
    private static Printer printer;

    private byte[] command;

    @BeforeClass
    public static void setUp() {
        printer = new Printer();
        view = new StandardView(printer);
    }

    @Test
    public void shouldReturnPlayIfInputIsP() throws IOException {
        command = "P".getBytes();       //Input = P
        InputStream inputStream = new ByteArrayInputStream(command);
        System.setIn(inputStream);          //System in now reads from my own inputstream

        IView.selectedAction input = view.selectedAction();
       assertEquals(IView.selectedAction.Play, input);
    }

    @Test
    public void shouldReturnSettingsIfInputIsS() {
        command = "S".getBytes();       //Input = S
        InputStream inputStream = new ByteArrayInputStream(command);
        System.setIn(inputStream);

        IView.selectedAction input = view.selectedAction();
        assertEquals(IView.selectedAction.Settings, input);
    }

    @Test
    public void shouldReturnQuitIfInputIsQ() {
        command = "Q".getBytes();       //Input = Q
        InputStream inputStream = new ByteArrayInputStream(command);
        System.setIn(inputStream);

        IView.selectedAction input = view.selectedAction();
        assertEquals(IView.selectedAction.Quit, input);
    }

    @Test
    public void shouldReturnErrorIfInputIsNotAnyOfAbove() {
        command = "b".getBytes();       //Input = b
        InputStream inputStream = new ByteArrayInputStream(command);
        System.setIn(inputStream);

        IView.selectedAction input = view.selectedAction();
        assertEquals(IView.selectedAction.Error, input);
    }
}


package ViewTests;

import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Ludde on 2015-11-18.
 */
public class selectedActionEnumMethodTests {
    private IView view;
    private Printer printer;

    final byte[] play = "P".getBytes();    // Press P to Play

    @Before
    public void setUp() {
        InputStream inputStream = new ByteArrayInputStream(play);
        printer = new Printer();
        view = new StandardView(printer);
        System.setIn(inputStream);          //System in now reads from my own inputstream
    }

    @Test
    public void testInput() throws IOException {
       IView.selectedAction input = view.selectedAction();
       assertEquals(input, IView.selectedAction.Play);
    }
}


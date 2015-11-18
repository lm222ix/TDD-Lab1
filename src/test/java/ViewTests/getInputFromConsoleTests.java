package ViewTests;

import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

import static junit.framework.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Ludde on 2015-11-18.
 */

public class getInputFromConsoleTests {

    private IView view;
    private Printer printer;
    final byte[] quit1 = "Q".getBytes();    //These two will return the same, since read() only returns the first character
    final byte[] quit2 = "Quit".getBytes();


    InputStream inputStream = new ByteArrayInputStream(quit1);
    @Before
    public void setUp() {
        printer = new Printer();
        view = new StandardView(printer);
        System.setIn(inputStream);          //System in now reads from my own inputstream
    }

    @Test
    public void testInput() throws IOException{
        assertEquals(view.getInput(), "Q".hashCode());      //View.getinput returns the input in hashcode(int) format.
    }
}

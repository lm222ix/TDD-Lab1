package ViewTests;

import Model.Question;
import View.IView;
import View.Printer;
import View.StandardView;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.mockito.Mockito.*;
import static junit.framework.Assert.*;
/**
 * Created by Ludde on 2015-11-19.
 */
public class displayQuestionTests {

    private static IView view;
    private static Question question;
    private static Printer printer;

    private static final ArrayList<Integer> testNumbers = new ArrayList<Integer>(
            Arrays.asList(1,2,3)
    );
    private static final char plusOperator = '+';
    private static final char minusOperator = '-';

    private final String shouldLookLikeThis = "1 + 2 + 3";
    private final String minusShouldLookLikeThis = "1 - 2 - 3";

    @BeforeClass
    public static void setUp() {
        printer = mock(Printer.class);
        view = new StandardView(printer);
        question = mock(Question.class);
        when(question.getNumbers()).thenReturn(testNumbers);
        when(question.getOperator()).thenReturn(plusOperator);
        question.makeNewQuestion(1);
    }

    @Test
    public void displayQuestionShouldPrintNicely() {
        view.displayQuestion(question);
        verify(printer, times(1)).println(shouldLookLikeThis);
    }

    @Test
    public void worksWithMinus() {
        when(question.getOperator()).thenReturn(minusOperator);
        question.makeNewQuestion(1);
        view.displayQuestion(question);
        verify(printer, times(1)).println(minusShouldLookLikeThis);
    }

}

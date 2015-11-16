package QuestionClassCalculateAnswerTests;

import Model.Question;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-16.
 */
public class CalculateAnswerWithPlusOperator {

    private static Question q;

    @BeforeClass
    public static void setUp() {

        q = Mockito.mock(Question.class);
        ArrayList<Integer> testList = new ArrayList<Integer>(
                Arrays.asList(5,3,9)
        );

        Mockito.when(q.getNumbers()).thenReturn(testList);
        Mockito.when(q.getOperator()).thenReturn('+');
        Mockito.when(q.getAnswer()).thenCallRealMethod();
        q = new Question(1);
    }

    @Test
    public void shouldCalculateCorrectWithPlusOperator() {
        q.calculateAnswer();
        assertEquals(17, q.getAnswer());

    }
}

package QuestionClassCalculateAnswerTests;

import static org.mockito.Matchers.*;
import Model.Question;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.Arrays;
import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-16.
 */
public class CalculateAnswerWithPlusOperator {

    private static Question q;
    private static ArrayList<Integer> testList;

    @BeforeClass
    public static void setUp() {
        testList = new ArrayList<Integer>(
                Arrays.asList(5,3)
        );
        q = new Question() {
            @Override
            public void makeNewQuestion(int diff) {
                setOperator('+');
                setNumbers(testList);
                setAnswer(calculateAnswer());
            }
        };
    }

    @Test
    public void shouldCalculateCorrectWithPlusOperatorDiffOne() {
        q.makeNewQuestion(1);
        assertEquals(8, q.getAnswer());
    }


    /*
    mockedQuestion = Mockito.mock(Question.class);
        Mockito.doAnswer(new Answer<ArrayList>() {
            public ArrayList answer(InvocationOnMock invocation) {
                return testList;
            }
        }).when(mockedQuestion).makeNewQuestion(1);
     */
}

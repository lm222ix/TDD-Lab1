package ModelTests.QuestionClassCalculateAnswerTests;

import Model.Question;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Ludde on 2015-11-17.
 */
public class CalculateAnswerWithMinusOperator {

    private static Question q;
    private static ArrayList<Integer> testList;

    @BeforeClass
    public static void setUp() {
        testList = new ArrayList<Integer>(
                Arrays.asList(5, 3)
        );
        q = new Question() {
            @Override
            public void makeNewQuestion(int diff) {
                setOperator('-');
                setNumbers(testList);
                setAnswer(calculateAnswer());
            }
        };
    }

    @Test
    public void shouldCalculateCorrectWithMinusOperatorDiffOne() {
        q.makeNewQuestion(1);
        assertEquals(2, q.getAnswer());
    }
}

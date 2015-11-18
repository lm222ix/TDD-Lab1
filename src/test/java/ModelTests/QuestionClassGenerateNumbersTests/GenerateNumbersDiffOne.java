package ModelTests.QuestionClassGenerateNumbersTests;

import Model.Question;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 * Created by Ludde on 2015-11-16.
 */
public class GenerateNumbersDiffOne {

    private static Question q;

    @BeforeClass
    public static void setUp() {
        q = new Question();
        q.makeNewQuestion(1);
    }

    @Test
    public void generateQuestionWithDiffOneTest() {
        assertEquals(2, q.getNumbers().size());
    }

    @Test
    public void randomNumbersShouldBeBetweenOneAndNineForDiffOneQuestion() {
        ArrayList<Integer> numbers = q.getNumbers();
        if(numbers.size() == 0)
            fail();
        for(int i = 0; i<numbers.size(); i++) {
            if(numbers.get(i)> 9 || numbers.get(i) <1) {
                fail();
            }
        }
    }
}

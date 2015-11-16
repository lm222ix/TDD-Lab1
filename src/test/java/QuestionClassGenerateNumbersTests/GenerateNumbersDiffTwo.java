package QuestionClassGenerateNumbersTests;

import Model.Question;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 * Created by Ludde on 2015-11-16.
 */
public class GenerateNumbersDiffTwo {

    private static Question q;

    @BeforeClass
    public static void setUp() {
        q = new Question(2);
    }

    @Test
    public void generateQuestionWithDiffTwoTest() {
        ArrayList<Integer> numbers = q.getNumbers();
        assertEquals(3, numbers.size());
    }

    @Test
    public void randomNumbersShouldBeBetweenOneAndNineForDiffTwoQuestion() {
        ArrayList<Integer> numbers = q.getNumbers();
        if(numbers.size() == 0)
            fail();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 9 || numbers.get(i) < 1) {
                fail();
            }
        }
    }

}

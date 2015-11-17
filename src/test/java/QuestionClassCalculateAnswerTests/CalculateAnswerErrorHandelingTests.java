package QuestionClassCalculateAnswerTests;

import Model.Question;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Ludde on 2015-11-17.
 */
public class CalculateAnswerErrorHandelingTests {

    private static Question q;

    @BeforeClass
    public static void setUp() {
        q = new Question();

    }

    @Test
    public void errorWhenNumbersNotGeneratedYet() {
    }
}

package ModelTests.QuestionClassGenerateNumbersTests;

import Model.Question;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 * Created by Ludde on 2015-11-16.
 */
public class GenerateNumbersBadInput {

    private static Question q;

    @BeforeClass
    public static void setUp() {
        q = new Question();
    }

    @Test(expected = IllegalArgumentException.class)
    public void IncorrDiffShouldReturnException() {

        q.makeNewQuestion(0);
    }
}

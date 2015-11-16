package QuestionClassGenerateOperatorTests;

import Model.Question;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Ludde on 2015-11-16.
 */
public class GenerateOperatorTest {

    private static Question q;

    @BeforeClass
    public static void setUp() {
        q = new Question(1);
    }

    @Test
    public void operatorShouldBePlusOrMinus() {

    }


}

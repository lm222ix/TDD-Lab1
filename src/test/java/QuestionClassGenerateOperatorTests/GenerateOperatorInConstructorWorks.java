package QuestionClassGenerateOperatorTests;

import Model.Question;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-16.
 */
public class GenerateOperatorInConstructorWorks {

    private static Question q;

    @BeforeClass
    public static void setUp() {
        q = new Question(1);
    }

    @Test
    public void constructorGeneratesAOperator() {
        System.out.println(q.getOperator());
        assertNotSame('\u0000', q.getOperator());       //'\u0000' is the default value of a char according to javadocs.
    }
}

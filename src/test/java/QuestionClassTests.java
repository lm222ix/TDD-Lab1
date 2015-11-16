import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-13.
 * The goal of this class is to create a randomized math question when the instructor is called.
 * The constructor only takes one int parameter wich is the difficulty. The question should be
 * harder for higher difficulty (diff can be 1,2 or 3).
 */
public class QuestionClassTests {

    private static Question q;

    @BeforeClass
    public static void setUp() {
        q = new Question();
    }


    @Test
    public void generateQuestionWithDiffOneTest() {
        q.generateQuestion(1);
        assertEquals(3, q.getNumbers().size());
    }


}

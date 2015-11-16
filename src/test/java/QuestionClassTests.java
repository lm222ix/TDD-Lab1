import junit.framework.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.*;

/**
 * Created by Ludde on 2015-11-13.
 * The goal of this class is to create a randomized math question when the instructor is called.
 * The constructor only takes one int parameter wich is the difficulty. The question should be
 * harder for higher difficulty (diff can be 1,2 or 3).
 */
public class QuestionClassTests {

    private static Question q;
    /*
    @BeforeClass
    public static void setUp() {
        q = new Question();
    }
    */
    @Before
    public void beforeEachTest() {
        q = new Question();
    }


    @Test
    public void generateQuestionWithDiffOneTest() {
        q.generateQuestion(1);
        assertEquals(2, q.getNumbers().size());
    }

    @Test
    public void randomNumbersShouldBeBetweenOneAndNineForDiffOneQuestion() {
        q.generateQuestion(1);
        ArrayList<Integer> numbers = q.getNumbers();
        if(numbers.size() == 0)
            fail();
        for(int i = 0; i<numbers.size(); i++) {
            if(numbers.get(i)> 9 || numbers.get(i) <1) {
                fail();
            }
        }

    }

    @Test
    public void generateQuestionWithDiffTwoTest() {
        q.generateQuestion(2);
        ArrayList<Integer> numbers = q.getNumbers();
        assertEquals(3, numbers.size());
    }

    @Test
    public void randomNumbersShouldBeBetweenOneAndNineForDiffTwoQuestion() {
        q.generateQuestion(2);
        ArrayList<Integer> numbers = q.getNumbers();
        if(numbers.size() == 0)
            fail();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 9 || numbers.get(i) < 1) {
                fail();
            }
        }
    }

    @Test
    public void generateQuestionWithDiffThreeTest() {
        q.generateQuestion(3);
        ArrayList<Integer> numbers = q.getNumbers();
        assertEquals(3, numbers.size());
    }

    @Test
    public void randomNumbersShouldBeBetween100And199ForDiffThreeQuestion() {
        q.generateQuestion(3);
        ArrayList<Integer> numbers = q.getNumbers();
        if(numbers.size() == 0)
            fail();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > 199 || numbers.get(i) < 100) {
                fail();
            }
        }
    }


}

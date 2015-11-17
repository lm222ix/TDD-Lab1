package QuestionClassGenerateOperatorTests;

import static junit.framework.Assert.*;
import Model.Question;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Random;

/**
 * Created by Ludde on 2015-11-16.
 */
public class GenerateOperatorPlus {

    private static Question q;
    private static Random mockedRandom;

    @BeforeClass
    public static void setUp() throws Exception {
        mockedRandom = Mockito.mock(Random.class);
        Mockito.when(mockedRandom.nextInt(2)).thenReturn(0);
        q = new Question();
        q.makeNewQuestion(1);
    }
    @Test
    public void operatorShouldBePlus() {
        q.generateOperator(mockedRandom);
        assertEquals('+', q.getOperator());
    }

}

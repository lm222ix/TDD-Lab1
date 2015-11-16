package QuestionClassGenerateOperatorTests;

import Model.Question;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Random;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Ludde on 2015-11-16.
 */
public class GenerateOperatorMinus {

    private static Question q;
    private static Random mockedRandom;

    @BeforeClass
    public static void setUp() throws Exception {
        mockedRandom = Mockito.mock(Random.class);
        Mockito.when(mockedRandom.nextInt(2)).thenReturn(1);
        q = new Question(1);
    }
    @Test
    public void operatorShouldBeMinus() {
        q.generateOperator(mockedRandom);
        assertEquals('-', q.getOperator());
    }
}



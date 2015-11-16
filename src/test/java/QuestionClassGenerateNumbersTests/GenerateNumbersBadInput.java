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
public class GenerateNumbersBadInput {

    private static Question q;

    @Test(expected = IllegalArgumentException.class)
    public void IncorrDiffShouldReturnException() {
        
        q = new Question(0);
    }
}

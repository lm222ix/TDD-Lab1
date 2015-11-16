package Model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ludde on 2015-11-16.
 */
public class Question {

    private ArrayList<Integer> numbers;
    private Random random;

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }


    public Question(int diff) {
        numbers = new ArrayList<Integer>();
        random = new Random();
        generateQuestion(diff);

    }


    //Generates a question based on difficulty 1,2 or 3.
    public  void generateQuestion(int diff) {
        if(diff == 1) {
            for(int i = 0; i<2; i++) {
                this.numbers.add(i, random.nextInt(9) + 1);
            }
        } else if(diff == 2) {
            for(int i = 0; i<3; i++) {
                this.numbers.add(i, random.nextInt(9) + 1);
            }
        } else if(diff == 3) {
            for(int i = 0; i<3; i++) {
                this.numbers.add(i, random.nextInt(99) + 100);
            }
        }

    }





}

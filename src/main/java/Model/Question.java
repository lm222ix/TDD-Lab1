package Model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ludde on 2015-11-16.
 */
public class Question {

    private ArrayList<Integer> numbers;
    private Random random;
    private char operator;
    private int answer;

    public int getAnswer() {
        return this.answer;
    }
    public void setAnswer(int answer) {
        this.answer = answer;
    }
    // Set&Gets

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }
    public void setNumbers(ArrayList<Integer> n) {
        this.numbers = n;
    }


    //Constructor and methods

    public Question() {
        numbers = new ArrayList<Integer>();
        random = new Random();
    }

    public void makeNewQuestion(int diff) {
        clearOld();
        generateOperator(this.random);
        generateNumbers(diff);
        calculateAnswer();
    }
    private void clearOld() {
        this.numbers.clear();
    }

    //Generates a question based on difficulty 1,2 or 3.
    public  void generateNumbers(int diff) {
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
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void generateOperator(Random random) {
        int r = random.nextInt(2);
        if(r == 0) {
            setOperator('+');
        } else if(r == 1) {
            setOperator('-');
        }
    }

    public void calculateAnswer() {
        if(getNumbers().equals(null)) {
            throw new NullPointerException();
        }
            int answer = 0;
            for (int i = 0; i < getNumbers().size(); i++) {
                answer += getNumbers().get(i);
            }
            this.answer = answer;
    }





}

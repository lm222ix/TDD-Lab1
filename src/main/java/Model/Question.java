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


    // Set&Gets

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getAnswer() {
        return this.answer;
    }
    public void setAnswer(int answer) {
        this.answer = answer;
    }

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
        setOperator(generateOperator());
        setNumbers(generateNumbers(diff));
        setAnswer(calculateAnswer());
    }
    private void clearOld() {
        this.numbers.clear();
    }

    //Generates a question based on difficulty 1,2 or 3.
    public  ArrayList<Integer> generateNumbers(int diff) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        if(diff == 1) {
            for(int i = 0; i<2; i++) {
                numbers.add(random.nextInt(9) + 1);
            }
        } else if(diff == 2) {
            for(int i = 0; i<3; i++) {
                numbers.add(random.nextInt(9) + 1);
            }
        } else if(diff == 3) {
            for(int i = 0; i<3; i++) {
                numbers.add(random.nextInt(99) + 100);
            }
        } else {
            throw new IllegalArgumentException();
        }
        return numbers;
    }

    public char generateOperator() {
        int r = this.random.nextInt(2);
        if(r == 0) {
            return '+';
        } else if(r == 1) {
            return '-';
        }
        return '\u0000';
    }

    public int calculateAnswer() {
        int answer = 0;
        if(this.operator == '+') {
            for (int i = 0; i < getNumbers().size(); i++) {
                answer += getNumbers().get(i);
            }
        } else if(this.operator == '-') {
            for(int i = 0; i<numbers.size(); i++) {
                if(i==0) {
                    answer += numbers.get(i);
                } else {
                    answer -= numbers.get(i);
                }
            }
        }
            return answer;
    }





}

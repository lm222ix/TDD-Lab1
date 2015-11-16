import java.util.ArrayList;

/**
 * Created by Ludde on 2015-11-16.
 */
public class Question {

    private ArrayList<Integer> numbers;

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }


    public Question() {
        numbers = new ArrayList<Integer>();
    }


    //Generates a question based on difficulty 1,2 or 3.
    public  void generateQuestion(int diff) {
        if(diff == 1) {
            this.numbers.add(1);
            this.numbers.add(1);
            this.numbers.add(1);

        }

    }





}

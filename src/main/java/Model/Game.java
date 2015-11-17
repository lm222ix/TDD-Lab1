package Model;

/**
 * Created by Ludde on 2015-11-13.
 * Simple game class. Will contain the difficulty the user sets and keep score of the game.
 */
public class Game {

    private int difficulty;
    private int score;
    private Question question;

    public Game() {
        difficulty = 1;
        score = 0;
        question = new Question();
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Question getQuestion() {
        return this.question;
    }
}

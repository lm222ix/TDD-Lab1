package Controller;

import Model.Game;
import Model.Question;
import View.IView;

/**
 * Created by Ludde on 2015-11-19.
 */
public class GameController {

    public Game game;
    public IView view;
    public Question question;

    public GameController(Game game, IView view, Question q) {
        this.game = game;
        this.view = view;
        this.question = q;
    }

    //public GameController() {}

    public boolean play() {
        IView.selectedAction input;
        input = view.selectedAction();

        if(input == IView.selectedAction.Play) {
            newGame();
        } else if(input == IView.selectedAction.Settings) {
            displaySettings();
        }
        return input != IView.selectedAction.Quit;
    }

    public void newGame() {
        game.setScore(0);
        for(int i = 0; i<10; i++) {
            question.makeNewQuestion(game.getDifficulty());
            view.displayQuestion(question);
            int answer = view.getAnswer();
            if(answer == question.getAnswer()) {
                this.game.setScore(this.game.getScore() + 1);
                view.printRightOrWrong(true);
            } else {
                view.printRightOrWrong(false);
            }
        }
    }


    public void displaySettings() {

    }

}
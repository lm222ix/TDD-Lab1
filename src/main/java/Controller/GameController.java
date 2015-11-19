package Controller;

import Model.Game;
import View.IView;

/**
 * Created by Ludde on 2015-11-19.
 */
public class GameController {

    public Game game;
    public IView view;

    public GameController(Game game, IView view) {
        this.game = game;
        this.view = view;
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
    }

    public void displaySettings() {

    }

}
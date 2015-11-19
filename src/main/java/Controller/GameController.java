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

    public GameController() {}

    public boolean play() {
        IView.selectedAction input;

        input = view.selectedAction();

        displaySettings();

        if(input == IView.selectedAction.Play) {
            newGame();
        } else if(input == IView.selectedAction.Quit) {
            return false;
        }
        return true;
    }

    public void newGame() {

    }

    public void displaySettings() {

    }

}
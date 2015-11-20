package View;

import java.io.InputStream;

/**
 * Created by Ludde on 2015-11-18.
 */
public interface IView {

    enum selectedAction{Settings,Play,Quit,Error}

    public void displayWelcome();
    public void displayInstructions();
    public void displayEditSettingsMenu();
    public selectedAction selectedAction();
    public int getInput();
    public int getAnswer();
    public void displayResult(int score);
    public void printRightOrWrong(boolean bool);
    public void displayQuestion(Model.Question question);
    }

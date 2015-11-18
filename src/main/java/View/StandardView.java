package View;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Ludde on 2015-11-18.
 */
public class StandardView implements IView {

    private Printer printer;

    public StandardView(Printer p) {
        printer = p;
    }

    public void displayWelcome(){
        printer.println("Welcome to the MathGame! This is a small game to practice doing math quickly in your head.");
    }

    public void displayInstructions() {
        printer.println("Change difficulties by pressing S" +
                ", or start playing by pressing P. Press Q to quit");
    }

    public void displayEditSettingsMenu() {
        printer.println("Please enter 1, 2 or 3 to select difficulty. Higher is harder: ");
    }

    public int getInput() {
        try{
            return System.in.read();
        } catch(IOException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public selectedAction selectedAction() {
        int i = getInput();
        if(i == 'P') {
            return selectedAction.Play;
        } else if(i == 'S') {
            return selectedAction.Settings;
        } else if(i == 'Q') {
            return selectedAction.Quit;
        }
        else {
            return selectedAction.Error;
        }
    }

    public void displayResult(int score) {
        String message = "Game over. Your score was: " + score + ", ";
        if(score>9) {
            message += "thats awesome!";
        } else if(score>6){
            message += "nice!";
        } else if(score>3) {
            message += "you can do better!";
        } else {
            message += "you suck man!";
        }
        printer.println(message);
    }

    public void printRightOrWrong(boolean win) {
        if(win) {
            printer.println("Correct!");
        } else if(!win) {
            printer.println("Wrong!");
        }

    }
}

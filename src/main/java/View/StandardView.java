package View;

/**
 * Created by Ludde on 2015-11-18.
 */
public class StandardView implements IView {

    private Printer p;

    public StandardView(Printer printer) {
        p = printer;
    }

    public void displayWelcome(){
        p.println("Welcome to the MathGame! This is a small game to practice doing math quickly in your head.");
    }

    public void displayInstructions() {
        p.println("Change difficulties by pressing S" +
                ", or start playing by pressing P. Press Q to quit");
    }

    public void displayEditSettingsMenu() {
        p.println("Please enter 1, 2 or 3 to select difficulty. Higher is harder: ");
    }
}

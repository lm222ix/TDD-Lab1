package View;

import java.io.InputStream;

/**
 * Created by Ludde on 2015-11-18.
 */
public interface IView {
    public void displayWelcome();
    public void displayInstructions();
    public void displayEditSettingsMenu();

    public int getInput();
}

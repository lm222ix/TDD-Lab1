import Controller.GameController;
import Model.Game;
import Model.Question;
import View.IView;
import View.Printer;
import View.StandardView;

/**
 * Created by Ludde on 2015-11-20.
 */
public class main {

    public static void main(String[] args) {
        IView v = new StandardView(new Printer());
        Game g = new Game();
        Question q = new Question();

        GameController gc = new GameController(g,v,q);
        while(gc.play());
    }
}

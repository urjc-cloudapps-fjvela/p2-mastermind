package mastermind.views.console;

import mastermind.models.Message;
import mastermind.views.console.utils.WithConsoleModel;

public class GameView extends WithConsoleModel {

    public GameView() {
    }

    public void showWelcome() {
        console.writeln();
        console.writeln(Message.TITLE);
    }
}
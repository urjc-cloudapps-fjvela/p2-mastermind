package mastermind.views.console;

import mastermind.models.Message;
import mastermind.views.console.utils.WithConsoleModel;

public class WinnerView extends WithConsoleModel {

    public WinnerView() {

    }

    public void show() {
        console.write(Message.WINNER);
    }
}
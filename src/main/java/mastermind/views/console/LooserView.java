package mastermind.views.console;

import mastermind.models.Message;
import mastermind.views.console.utils.WithConsoleModel;

public class LooserView extends WithConsoleModel {

    public LooserView() {

    }

    public void show() {
        console.write(Message.LOOSER);
    }
}
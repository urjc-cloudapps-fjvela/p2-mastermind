package mastermind.views.console;

import mastermind.controllers.ProposeCombinationController;
import mastermind.views.console.utils.WithConsoleModel;

public class SecretCombinationView extends WithConsoleModel {
    private ProposeCombinationController controller;

    public SecretCombinationView(ProposeCombinationController controller) {
        this.controller = controller;
    }

    public void show() {
        console.writeln(controller.getSecretCombination());
    }
}
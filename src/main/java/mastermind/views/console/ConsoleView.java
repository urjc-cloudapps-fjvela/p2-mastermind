package mastermind.views.console;

import mastermind.controllers.*;
import mastermind.views.View;
import mastermind.views.console.utils.YesNoDialog;;

public class ConsoleView extends View {

    @Override
    public void interact(Controller controller) {
        controller.accept(this);
    }

    public void visit(StartController startController) {
        startController.start();
        new GameView().showWelcome();
    }

    public void visit(ProposeCombinationController proposeCombinationController) {
        new SecretCombinationView(proposeCombinationController).show();

        new ProposedCombinationView(proposeCombinationController).readProposedCombination();
        proposeCombinationController.calculateResult();

        new ResultCombinationView(proposeCombinationController).showResume();

        checkIsWinnerOrIsLooser(proposeCombinationController);

    }

    public void visit(ResumeController resumeController) {
        resumeController.resume(new YesNoDialog().read());
    }

    private void checkIsWinnerOrIsLooser(ProposeCombinationController proposeCombinationController) {
        if (proposeCombinationController.isWinner()) {
            new LooserView().show();
        }

        if (proposeCombinationController.isLooser()) {
            new LooserView().show();
        }
        
        if (proposeCombinationController.isWinner() || proposeCombinationController.isLooser()) {
            proposeCombinationController.next();

        }
    }
}
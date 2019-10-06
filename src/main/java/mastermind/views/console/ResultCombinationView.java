package mastermind.views.console;

import java.util.List;

import mastermind.controllers.ProposeCombinationController;
import mastermind.models.ProposedCombination;
import mastermind.models.Result;
import mastermind.views.console.utils.WithConsoleModel;

public class ResultCombinationView extends WithConsoleModel {
    private ProposeCombinationController controller;

    public ResultCombinationView(ProposeCombinationController proposeCombinationController) {
        this.controller = proposeCombinationController;
    }

    public void showResume() {
        List<ProposedCombination> proprosedCombinations = controller.getProprosedCombinations();
        List<Result> results = controller.getResults();
        console.writeln(String.format("Attemps: %d", proprosedCombinations.size()));

        for (int i = 0; i < proprosedCombinations.size(); i++) {
            show(proprosedCombinations.get(i));
            show(results.get(i));
            console.writeln();
        }
    }

    private void show(ProposedCombination proposedCombination) {
        console.write(proposedCombination.getColors());
    }

    private void show(Result result) {
        console.write(String.format(" =>  Blacks: %d  Whites: %d", result.getBlacks(), result.getWhites()));
    }

}
package mastermind.controllers;

import java.util.List;

import mastermind.models.*;

public class ProposeCombinationController extends Controller {

	public ProposeCombinationController(Game game, State state) {
		super(game, state);
	}

	@Override
	public void accept(IControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

	public void setProposedCombination(ProposedCombination proposedCombination) {
		game.setProposedCombination(proposedCombination);
	}

	public void calculateResult() {
		game.calculateResult();
	}

	public List<ProposedCombination> getProprosedCombinations() {
		return game.getProprosedCombinations();
	}

	public List<Result> getResults() {
		return game.getResults();
	}

	public String getSecretCombination() {
		return game.getSecretCombination();
	}

	public boolean isWinner() {
		return game.isWinner();
	}

	public boolean isLooser() {
		return game.isLooser();
	}
}
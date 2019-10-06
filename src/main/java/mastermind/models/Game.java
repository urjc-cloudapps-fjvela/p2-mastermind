package mastermind.models;

import java.util.ArrayList;
import java.util.List;

import mastermind.Const;

public class Game {
    private SecretCombination secretCombination;
    private List<ProposedCombination> proposedCombinations;
    private List<Result> results;

    public Game() {
        clear();
    }

    public void clear() {
        secretCombination = new SecretCombination();
        proposedCombinations = new ArrayList<ProposedCombination>();
        results = new ArrayList<Result>();
    }

    public String getSecretCombination() {
        return secretCombination.getCombination();
    }

    public void setProposedCombination(ProposedCombination proposedCombination) {
        proposedCombinations.add(proposedCombination);
    }

    public void calculateResult() {
        results.add(secretCombination.getResult(proposedCombinations.get(proposedCombinations.size() - 1)));
    }

    public boolean isWinner() {
        return (results.get(getAttemps() - 1).isWinner());
    }

    public boolean isLooser() {
        return (getAttemps() == Const.MAX_LONG);
    }

    private int getAttemps() {
        return this.proposedCombinations.size();
    }

    public List<Result> getResults() {
        return results;
    }

    public List<ProposedCombination> getProprosedCombinations() {
        return proposedCombinations;
    }
}
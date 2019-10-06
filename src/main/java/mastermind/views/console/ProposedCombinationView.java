package mastermind.views.console;

import java.util.ArrayList;
import java.util.List;

import mastermind.Const;
import mastermind.controllers.ProposeCombinationController;
import mastermind.models.Color;
import mastermind.models.Error;
import mastermind.models.Message;
import mastermind.models.ProposedCombination;
import mastermind.views.console.utils.WithConsoleModel;

public class ProposedCombinationView extends WithConsoleModel {
    private ProposeCombinationController proposeCombinationController;

    public ProposedCombinationView(ProposeCombinationController proposeCombinationController) {
        this.proposeCombinationController = proposeCombinationController;
    }

    public void readProposedCombination() {
        List<Color> colors = read();
        proposeCombinationController.setProposedCombination(new ProposedCombination(colors));
    }

    private List<Color> read() {
        Error error;
        List<Color> colors = new ArrayList<Color>(Const.WIDTH);

        do {
            error = null;
            console.write(Message.PROPOSED_COMBINATION);

            String characters = this.console.readString();
            if (characters.length() != Const.WIDTH) {
                error = Error.WRONG_LENGTH;
            } else {
                for (int i = 0; i < characters.length(); i++) {
                    Color color = Color.getInstance(characters.charAt(i));
                    if (color == null) {
                        error = Error.WRONG_CHARACTERS;
                    } else {
                        for (int j = 0; j < colors.size(); j++) {
                            if (color == colors.get(j)) {
                                error = Error.DUPLICATED;
                            }
                        }
                        colors.add(color);
                    }
                }
            }
            if (error != null) {
                console.writeln(error);

                while (!colors.isEmpty()) {
                    colors.remove(0);
                }
            }
        } while (error != null);

        return colors;
    }
}
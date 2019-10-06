package mastermind.controllers;


import mastermind.models.State;
import mastermind.models.Game;

public class ResumeController extends Controller {

    public ResumeController(Game game, State state) {
        super(game, state);
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.game.clear();
            this.state.reset();
        } else {
            this.state.next();
        }
    }

    @Override
    public void accept(IControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
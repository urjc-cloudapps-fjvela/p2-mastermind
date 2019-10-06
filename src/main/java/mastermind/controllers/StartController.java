package mastermind.controllers;

import mastermind.models.*;

public class StartController extends Controller {
    public StartController(Game game, State state) {
        super(game, state);
    }

    @Override
    public void accept(IControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    } 

    public void start() {
        state.next();
    }
}
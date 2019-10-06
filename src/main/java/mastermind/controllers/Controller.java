package mastermind.controllers;

import mastermind.models.*;

public abstract class Controller {

    protected Game game;

    protected State state;

    public Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public abstract void accept(IControllerVisitor controllerVisitor);

    public void next() {
        state.next();
    }
}
package mastermind.controllers;

import java.util.HashMap;
import mastermind.controllers.Controller;
import mastermind.models.*;

public class Logic {
    
    private Game game;
    private State state;
    private HashMap<State.StateValue, Controller> controllers;

    public Logic() {
        game = new Game();
        state = new State();
        controllers = new HashMap<>();
        controllers.put(State.StateValue.START, new StartController(this.game, this.state));
        controllers.put(State.StateValue.PROPOSE, new ProposeCombinationController(this.game, this.state));
        controllers.put(State.StateValue.RESUME, new ResumeController(this.game, this.state));
        controllers.put(State.StateValue.EXIT, null);

    }

    public Controller getController() {
        return this.controllers.get(this.state.getValueState());
    }        
    
}
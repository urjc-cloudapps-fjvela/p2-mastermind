package mastermind.views;
import mastermind.controllers.*;

public abstract class View implements IControllerVisitor {

    public abstract void interact(Controller controller);

}
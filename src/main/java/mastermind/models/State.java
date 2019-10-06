package mastermind.models;

public class State {
    public enum StateValue {
        START,
        PROPOSE,
        RESUME,
        EXIT
    }

    private StateValue stateValue;

    public State() {
        this.stateValue = StateValue.START;
    }

    public void next() {
        this.stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
    }

    public void reset() {
        this.stateValue = StateValue.START;
    }

    public StateValue getValueState() {
        return this.stateValue;
    }
}
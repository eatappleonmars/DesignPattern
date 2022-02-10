public class GumballMachine implements State {

    protected int gumballs = 0;

    private final NoQuarterState noQuarterState = new NoQuarterState(this);
    private final HasQuarterState hasQuarterState = new HasQuarterState(this);
    private final SoldState soldState = new SoldState(this);
    private final SoldOutState soldOutState = new SoldOutState(this);

    private State state;

    public GumballMachine(int initGumballs) {
        this.gumballs = initGumballs;
        this.state = this.noQuarterState;
    }

    /**
     * All interface methods return void. We need a way to update the current state.
     * Apparently, the GumballMachine class itself cannot achieve that because it doesn't have the knowledge.
     * So we need to expose some method to allow others to do that.
     */
    public void setNoQuarterState() {
        this.state = this.noQuarterState;
    }

    public void setHasQuarterState() {
        this.state = this.hasQuarterState;
    }

    public void setSoldState() {
        this.state = this.soldState;
    }

    public void setSoldOutState() {
        this.state = this.soldOutState;
    }

    @Override
    public void insertQuarter() {
        this.state.insertQuarter();
    }

    @Override
    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    @Override
    public void turnCrank() {
        this.state.turnCrank();
    }

    @Override
    public void dispense() {
        this.state.dispense();
    }

    @Override
    public String toString() {
        return String.format(
                "Mighty Gumball, Inc.%nJava-enabled Standing Gumball Model #2004%nInventory: %d gumballs%n%s%n",
                this.gumballs,
                this.state.toString());
    }
}

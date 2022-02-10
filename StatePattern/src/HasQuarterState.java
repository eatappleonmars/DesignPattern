public class HasQuarterState implements State {

    private final GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        this.gumballMachine.setNoQuarterState();
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        this.gumballMachine.setSoldState();
        this.gumballMachine.dispense();
    }

    @Override
    public void dispense() {
        System.out.println("You need to turn the crank");
    }

    @Override
    public String toString() {
        return "Machine has quarter";
    }
}

public class OldPerson extends Person{
    public OldPerson(int x, int y) {
        super(x, y);
    }

    @Override
    public void afterInfection() {
        infectionCounter = -1;

        currentState = State.dead;
    }
}

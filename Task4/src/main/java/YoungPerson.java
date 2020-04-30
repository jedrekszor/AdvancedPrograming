public class YoungPerson extends Person{

    public YoungPerson(int x, int y) {
        super(x, y);
    }

    @Override
    public void afterInfection() {
        infectionCounter = -1;

        int rand = (int)(Math.random()*2);
        if(rand == 0)
            currentState = State.dead;
        else {
            currentState = State.immune;
            immunityCounter = 0;
        }
    }

    @Override
    public void afterImmunity() {
        immunityCounter = -1;

        currentState = State.healthy;
    }
}

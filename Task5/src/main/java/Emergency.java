public class Emergency extends Floor{
    private int previous;
    public Emergency() {
        up = false;
        down = false;
        emergency = true;
        name = "The elevator is in the emergency state, please insert key to fix it";
    }

    public void enable(int previous) {
        this.previous = previous;
    }

    public int disable() {
        return previous;
    }
}

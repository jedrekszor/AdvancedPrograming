public class Floor {
    boolean up;
    boolean down;
    boolean emergency;
    String name;

    public boolean canUp() {
        return up;
    }
    public boolean canDown() {
        return down;
    }
    public boolean isEmergency() {
        return emergency;
    }

    @Override
    public String toString() {
        if(!emergency)
            return "You're on " + name + " floor";
        else
            return name;
    }
}

public class LittleTime extends Card{

    public LittleTime(int number) {
        super(number);
    }

    @Override
    public void calculateCall(float duration) {
        changeBalance(-0.2f * duration);
    }
}

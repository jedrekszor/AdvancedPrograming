public class Tagarela extends Card{
    public Tagarela(int number) {
        super(number);
    }

    @Override
    public void calculateCall(float duration) {
        if(duration > 1) {
            changeBalance(-0.5f + (duration - 1) * 0.02f);
        } else {
            changeBalance(-0.5f);
        }
    }
}

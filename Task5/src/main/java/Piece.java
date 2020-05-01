public abstract class Piece {
    private int value;
    String type;

    public Piece() {
        drawValue();
    }

    private void drawValue() {
        value = (int)(Math.random() * 4) + 1;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return type + ", " + value;
    }

    public abstract State drop();
    public abstract State secondDrop(Piece previous);
}

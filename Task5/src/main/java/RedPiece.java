public class RedPiece extends Piece{
    public RedPiece() {
        super();
        type = "Red";
    }

    @Override
    public State drop() {
        System.out.println("You dropped a red tile of value " + getValue() + "!");
        Game.getInstance().setValueOfRed(this);
        Game.getInstance().pieces.remove(this);
        return Game.getInstance().secondChoice;
    }

    @Override
    public State secondDrop(Piece previous) {
        return null;
    }
}

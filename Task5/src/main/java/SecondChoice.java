import java.util.List;

public class SecondChoice extends State{
    @Override
    public String toString() {
        return "I will now drop a blue tile";
    }

    public int getBluePiece() {
        int result = 0;
        for(Piece p: Game.getInstance().pieces) {
            if(p instanceof BluePiece && p.getValue() > Game.getInstance().getValueOfRed().getValue())
                result = Game.getInstance().pieces.indexOf(p);
        }
        return result;
    }
}

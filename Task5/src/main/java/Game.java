import java.util.ArrayList;
import java.util.List;

public class Game {
    private static Game instance;
    List<Piece> pieces;
    State currentState;
    FirstChoice firstChoice = new FirstChoice();
    SecondChoice secondChoice = new SecondChoice();
    int round = 1;
    Piece previousRed;
    int score = 0;

    public void start() {
        pieces = new ArrayList<>();
        drawAllPieces();
        currentState = new FirstChoice();
        update();
    }

    private void update() {
        while(true) {
            System.out.println("Round: " + round + ", Your score: " + score + ", Remaining tiles: " + pieces.size());
            System.out.println(currentState.toString() + pieces.size());
            currentState = pieces.get(currentState.getPiece(pieces.size())).drop();
            if(currentState instanceof SecondChoice) {
                System.out.println(currentState.toString());
                Piece temp = pieces.get(((SecondChoice) currentState).getBluePiece());
                if(temp == null) {
                    System.out.println("No more blue tiles");
                    continue;
                }
                currentState = temp.secondDrop(previousRed);
            }
            if(pieces.size() <= 0) {
                lose();
            }
            round++;
        }
    }





    private Game() {}

    private void drawAllPieces() {
        for (int i = 0; i < 5; i++) {
            RedPiece red = new RedPiece();
            pieces.add(red);
            BluePiece blue = new BluePiece();
            pieces.add(blue);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Piece p: pieces) {
            result += p + "\n";
        }
        return result;
    }

    void addScore(int points) {
        score += points;
    }

    public void setValueOfRed(Piece red) {
        previousRed = red;
    }

    public Piece getValueOfRed() {
        return previousRed;
    }

    public static synchronized Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    void lose() {
        System.out.println("You lost, Your score: " + score);
        return;
    }
}

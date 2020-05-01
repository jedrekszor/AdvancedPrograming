public class BluePiece extends Piece{
    public BluePiece() {
        super();
        type = "Blue";
    }

    @Override
    public State drop() {
        System.out.println("You dropped a blue tile! You earn " + getValue() + " points!");
        Game.getInstance().addScore(getValue());
        Game.getInstance().pieces.remove(this);
        return Game.getInstance().firstChoice;
    }

    @Override
    public State secondDrop(Piece previous) {
        System.out.println(Game.getInstance().pieces.size());
        Game.getInstance().pieces.remove(this);
        for(int i = 0; i < previous.getValue(); i++) {
            int type = (int)(Math.random()*2);
            Piece p;
            if(type == 0)
                p = new BluePiece();
            else
                p = new RedPiece();

            Game.getInstance().pieces.add(p);
//            System.out.println("dupa");
        }
        return Game.getInstance().firstChoice;
    }
}

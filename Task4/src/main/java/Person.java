public class Person {
    private int x;
    private int y;
    public int infectionCounter = -1;
    public int immunityCounter = -1;
    public State currentState;
    public enum State{
        healthy,
        infected,
        immune,
        dead
    }

    public Person(int x, int y) {
        this.x = x;
        this.y = y;
        currentState = State.healthy;
    }

    public void move(int globalX, int globalY) {
        boolean moved = false;
        do {
            int xVal = (int)(Math.random()*2);
            int yVal = (int)(Math.random()*2);
            int xSign = (int)(Math.random()*2);
            int ySign = (int)(Math.random()*4);

            if(xSign == 0)
                xVal *= -1;
            if(ySign == 0)
                yVal *= -1;

            if(xVal == 0 && yVal == 0 || (x + xVal < 0 || x + xVal >= globalX) || ( y + yVal < 0 || y + yVal >= globalY))
                continue;

            x += xVal;
            y += yVal;
            moved = true;
        }while(!moved);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void infect() {
        infectionCounter = 0;
//        System.out.println("infection");
    }
    public void afterInfection() {}
    public void afterImmunity() {}
}

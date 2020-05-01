import java.util.Scanner;

public abstract class State {
    @Override
    public abstract String toString();
    public int getPiece(int size) {
        int result;
        while(true){
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                result = sc.nextInt();
                if(result >= 1 && result <= size) {
                    break;
                }
            }
            System.out.println("Wrong number");
        }
        return result - 1;
    }
}
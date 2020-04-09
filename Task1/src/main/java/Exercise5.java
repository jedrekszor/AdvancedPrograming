import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    int[] bet = {0, 0, 0, 0, 0, 0};
    List<Integer> filled = new ArrayList<Integer>();
    int[] winning = {2, 13, 24, 35, 3, 9};

    void fillAll() {
        for(int i = 0; i < bet.length; i++) {
            if(bet[i] == 0) {
                while (true) {
                    int rand = (int) (Math.random() * 49) + 1;
                    if (canFill(rand)) {
                        bet[i] = rand;
                        filled.add(rand);
                        break;
                    }
                }
            }
        }
    }

    void fillOne() {
        boolean done = false;
        for(int i = 0; i < bet.length; i++) {
            if(done)
                break;
            if(bet[i] == 0) {
                while (true) {
                    int rand = (int) (Math.random() * 49) + 1;
                    if (canFill(rand)) {
                        bet[i] = rand;
                        filled.add(rand);
                        done = true;
                        break;
                    }
                }
            }
        }
    }

    boolean canFill(int x) {
        for(int num: filled) {
            if(num == x) {
                return false;
            }
        }
        return true;
    }

    boolean checkFull() {
        for(int num: bet) {
            if(num == 0)
                return false;
        }
        return true;
    }

    boolean checkWin() {
        for(int i = 0; i < bet.length; i++) {
            if(bet[i] != winning[i])
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String result = "";
        for(int num: bet) {
            result += num + "\n";
        }
        return result;
    }
}

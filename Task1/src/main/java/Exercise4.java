import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
    int[] array;
    List<Integer> filled = new ArrayList<Integer>();
    int counter;

    Exercise4() {
        array = new int[20];
        counter = 0;
        fill();
    }

    void fill() {
        for(int i = 0; i < array.length; i++) {
            while(true) {
                int rand = (int) (Math.random() * 100);
                if (canFill(rand)) {
                    array[i] = rand;
                    filled.add(rand);
                    break;
                }
            }
        }
    }

    boolean canFill(int x) {
        for(int num: filled) {
            if(num == x) {
                counter++;
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String result = "";
        for(int num: array) {
            result += num + "\n";
        }
        result += "Duplicates generated: " + counter;
        return result;
    }
}

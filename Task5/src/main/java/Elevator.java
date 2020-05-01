import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Elevator {
    private List<Floor> floors;
    int currentFloor;

    public Elevator() {
        Ground ground = new Ground();
        First first = new First();
        Second second = new Second();
        Emergency emergency = new Emergency();
        floors = new ArrayList<>();
        floors.add(ground);
        floors.add(first);
        floors.add(second);
        floors.add(emergency);
        currentFloor = 0;
        update();
    }

    private void update() {
        while(true) {
            boolean showOne = false;
            boolean showTwo = false;
            boolean emergency = false;
            System.out.println(floors.get(currentFloor));
            if (floors.get(currentFloor).canUp()) {
                System.out.println("1 - Go up");
                showOne = true;
            }
            if (floors.get(currentFloor).canDown()) {
                System.out.println("2 - Go down");
                showTwo = true;
            }
            if(!showOne && !showTwo) {
                System.out.println("3 - Insert key");
                emergency = true;
            }

            Scanner sc = new Scanner(System.in);
            if(sc.hasNextInt()) {
                int choice = sc.nextInt();
                if(choice == 1 && showOne)
                    goUp();
                else if(choice == 2 && showTwo)
                    goDown();
                else if(choice == 3 && emergency)
                    insertKey();
                else
                    setEmergency();
            }
        }
    }

    private void goUp() {
        currentFloor++;
    }

    private void goDown() {
        currentFloor--;
    }

    private void insertKey() {
        Emergency temp = (Emergency)floors.get(floors.size() - 1);
        currentFloor = temp.disable();
    }

    public void setEmergency() {
        Emergency temp = (Emergency)floors.get(floors.size() - 1);
        temp.enable(currentFloor);
        currentFloor = floors.size() - 1;
    }
}

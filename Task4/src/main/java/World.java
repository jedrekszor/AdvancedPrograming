import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
    private int[][] world;
    private int[][] worldWithInfected;
    private List<Person> people = new ArrayList<>();
    private List<Person> infected = new ArrayList<>();
    public int immunityPeriod;
    public int infectionPeriod;
    private int round;
    private int x;
    private int y;

    public World(int x, int y, int immunityPeriod, int infectionPeriod, int population) {
        this.x = x;
        this.y = y;
        this.immunityPeriod = immunityPeriod;
        this.infectionPeriod = infectionPeriod;
        initializeWorld();
        populateWorld(population);
        simulate();
    }

    private void populateWorld(int population) {
        for(int i = 0; i < population; i++) {
            Random rand = new Random();
            int tempX = (int)(Math.random()*x);
            int tempY = (int)(Math.random()*y);
            int tempAge = (int)(Math.random()*2);
            Person p;

            if(tempAge == 0)
                p = new YoungPerson(tempX, tempY);
            else
                p = new OldPerson(tempX, tempY);

            people.add(p);
        }
        people.get(0).currentState = Person.State.infected;
        infected.add(people.get(0));
        people.get(0).infect();
    }

    private void simulate() {
        while(true) {
            moveEveryone();
            updateGrid();
            infect();
            updateGrid();
            incrementCounters();

            System.out.println(this);
            cleanup();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void cleanup() {
        List<Person> temp = new ArrayList<>();
        for(Person p: people) {
            if(p.currentState == Person.State.dead) {
                infected.remove(p);
                temp.add(p);
            }
        }
        for(Person p: temp) {
            people.remove(p);
//            System.out.println("ded");
        }
    }

    private void incrementCounters() {
        for(Person p: people) {
            if(p.infectionCounter >= 0) {
                p.infectionCounter++;
                if(p.infectionCounter >= infectionPeriod)
                    p.afterInfection();
            }
            if(p.immunityCounter >= 0) {
                p.immunityCounter++;
                if(p.immunityCounter >= immunityPeriod) {
                    p.afterImmunity();
                    infected.remove(p);
                }
            }
        }
    }

    private void moveEveryone() {
        for(Person person: people) {
            person.move(x, y);
        }
    }

    private void infect() {
        for(Person p: people) {
            if(p.currentState == Person.State.infected){
                for(Person i: getPersonByCoordinates(p.getX(), p.getY())) {
                    if(i.currentState == Person.State.healthy) {
                        i.currentState = Person.State.infected;
                        infected.add(i);
                        i.infect();
//                        System.out.println("infection");
                    }
                }
            }
        }
    }

    private List<Person> getPersonByCoordinates(int cX, int cY) {
        List<Person> found = new ArrayList<>();
        for(Person p: people) {
            if(p.getX() == cX && p.getY() == cY)
                found.add(p);
        }
//        System.out.println(cX + ", " + cY + ", " + found.size());
        return found;
    }

    private void updateGrid() {
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                world[i][j] = 0;
                worldWithInfected[i][j] = 0;
            }
        }
        for(Person person: people) {
            world[person.getX()][person.getY()]++;
        }
        for(Person p: infected) {
            worldWithInfected[p.getX()][p.getY()] = -1;
        }
    }

    private void initializeWorld() {
        world = new int[x][y];
        worldWithInfected = new int[x][y];
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                world[i][j] = 0;
                worldWithInfected[i][j] = 0;
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                if(world[i][j] == 0)
                    result += " " + "\t";
                else if(worldWithInfected[i][j] != -1)
                    result += world[i][j] + "\t";
                else
                    result += "#" + "\t";
            }
            result += "\n";
        }
        result += "-------------------------------------" + " Population: " + people.size() + ", Healthy: " + (people.size() - infected.size()) + ", Infected: " + infected.size();
        return result;
    }
}

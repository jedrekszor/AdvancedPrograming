import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private String name;
    private List<String> stars;
    private List<String> planets;

    public SolarSystem(String name) {
        this.name = name;
        stars = new ArrayList<String>();
        planets = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void addStar(String star) {
        stars.add(star);
    }

    public void addPlanet(String planet) {
        planets.add(planet);
    }

    public String getStar(int index) {
        return stars.get(index);
    }

    public String getPlanet(int index) {
        return planets.get(index);
    }

    public String getStars() {
        String result = "";
        for(String record: stars) {
            result += record + "\t";
        }
        return result;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Systems {
    private List<SolarSystem> systems;

    public Systems() {
        systems = new ArrayList<SolarSystem>();
    }

    public void newSystem(String name) {
        SolarSystem solarSystem = new SolarSystem(name);
        systems.add(solarSystem);
    }

    public void addStar(String name, String star) {
        for(SolarSystem record: systems) {
            if(record.getName().compareTo(name) == 0) {
                record.addStar(star);
            }
        }
    }

    public void addPlanet(String name, String planet) {
        for(SolarSystem record: systems) {
            if(record.getName().compareTo(name) == 0) {
                record.addPlanet(planet);
            }
        }
    }

    public String getStar(String name, int index) {
        for(SolarSystem record: systems) {
            if(record.getName().compareTo(name) == 0) {
                return record.getStar(index);
            }
        }
        return null;
    }

    public String getPlanet(String name, int index) {
        for(SolarSystem record: systems) {
            if(record.getName().compareTo(name) == 0) {
                return record.getPlanet(index - 1);
            }
        }
        return null;
    }

    public String getStars(String name) {
        for(SolarSystem record: systems) {
            if(record.getName().compareTo(name) == 0) {
                return record.getStars();
            }
        }
        return null;
    }

    public boolean existsSystem(String name) {
        for(SolarSystem record: systems) {
            if(record.getName().compareTo(name) == 0) {
                return true;
            }
        }
        return false;
    }
}

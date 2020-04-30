import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    String name;
    List<String> vegetarian = new ArrayList<>();
    List<String> diet = new ArrayList<>();
    List<String> italian = new ArrayList<>();
    List<String> fastFood = new ArrayList<>();
    List<String> general = new ArrayList<>();

    public Restaurant(Gastronomy g) {

    }

    public String getName(){
        return name;
    }

    public String getVegetarian() {
        String result = "";
        for(String s: vegetarian) {
            result += s + "\n";
        }
        return result;
    }
    public String getDiet() {
        String result = "";
        for(String s: diet) {
            result += s + "\n";
        }
        return result;
    }
    public String getItalian() {
        String result = "";
        for(String s: italian) {
            result += s + "\n";
        }
        return result;
    }
    public String getFastFood() {
        String result = "";
        for(String s: fastFood) {
            result += s + "\n";
        }
        return result;
    }
    public String getGeneral() {
        String result = "";
        for(String s: general) {
            result += s + "\n";
        }
        return result;
    }



    public void addVegetarianMenu(String name) {
        FileReader reader = null;
        try {
            reader = new FileReader(name);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while((line = br.readLine()) != null) {
                vegetarian.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addDietMenu(String name) {
        FileReader reader = null;
        try {
            reader = new FileReader(name);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while((line = br.readLine()) != null) {
                diet.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addItalianMenu(String name) {
        FileReader reader = null;
        try {
            reader = new FileReader(name);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while((line = br.readLine()) != null) {
                italian.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addFastFoodMenu(String name) {
        FileReader reader = null;
        try {
            reader = new FileReader(name);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while((line = br.readLine()) != null) {
                fastFood.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addGeneralMenu(String name) {
        FileReader reader = null;
        try {
            reader = new FileReader(name);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while((line = br.readLine()) != null) {
                general.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

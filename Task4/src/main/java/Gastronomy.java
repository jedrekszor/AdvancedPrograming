import java.util.ArrayList;
import java.util.List;

public class Gastronomy {
    private List<Restaurant> vegetarian = new ArrayList<>();
    private List<Restaurant> diet = new ArrayList<>();
    private List<Restaurant> italian = new ArrayList<>();
    private List<Restaurant> fastFood = new ArrayList<>();
    private List<Restaurant> general = new ArrayList<>();

    public void addVegetarian(Restaurant r) {
        vegetarian.add(r);
    }
    public void addDiet(Restaurant r) {
        diet.add(r);
    }
    public void addItalian(Restaurant r) {
        italian.add(r);
    }
    public void addFastFood(Restaurant r) {
        fastFood.add(r);
    }
    public void addGeneral(Restaurant r) {
        general.add(r);
    }

    public void recommendVegetarian(){
        String result = "";
        for(Restaurant r: vegetarian) {
            result += "Name: " + r.getName() + "\n" + r.getVegetarian();
            result += "\n\n";
        }

        System.out.println(result);
    }
    public void recommendDiet(){
        String result = "";
        for(Restaurant r: diet) {
            result += "Name: " + r.getName() + "\n" + r.getDiet();
            result += "\n\n";
        }

        System.out.println(result);
    }
    public void recommendItalian(){
        String result = "";
        for(Restaurant r: italian) {
            result += "Name: " + r.getName() + "\n" + r.getItalian();
            result += "\n\n";
        }

        System.out.println(result);
    }
    public void recommendFastFood(){
        String result = "";
        for(Restaurant r: fastFood) {
            result += "Name: " + r.getName() + "\n" + r.getFastFood();
            result += "\n\n";
        }

        System.out.println(result);
    }
    public void recommendGeneral(){
        String result = "";
        for(Restaurant r: general) {
            result += "Name: " + r.getName() + "\n" + r.getGeneral();
            result += "\n\n";
        }

        System.out.println(result);
    }
}


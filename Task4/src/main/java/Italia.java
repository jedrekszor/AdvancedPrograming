public class Italia extends Restaurant{
    public Italia(Gastronomy g) {
        super(g);
        addVegetarianMenu("italia/vegetarian.txt");
        addDietMenu("italia/diet.txt");
        addItalianMenu("italia/italian.txt");
        addFastFoodMenu("italia/fastFood.txt");
        addGeneralMenu("italia/general.txt");

        if(vegetarian.size() > 0)
            g.addVegetarian(this);
        if(diet.size() > 0)
            g.addDiet(this);
        if(italian.size() > 0)
            g.addItalian(this);
        if(fastFood.size() > 0)
            g.addFastFood(this);
        if(general.size() > 0)
            g.addGeneral(this);

        name = "Italia";
    }
}

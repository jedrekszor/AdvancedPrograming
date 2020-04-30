public class GaleriaSabores extends Restaurant{
    public GaleriaSabores(Gastronomy g) {
        super(g);
        addVegetarianMenu("galeriaSabores/vegetarian.txt");
        addDietMenu("galeriaSabores/diet.txt");
        addItalianMenu("galeriaSabores/italian.txt");
        addFastFoodMenu("galeriaSabores/fastFood.txt");
        addGeneralMenu("galeriaSabores/general.txt");

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

        name = "Galeria de Sabores";
    }
}

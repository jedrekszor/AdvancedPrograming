public class BurgerKing extends Restaurant{
    public BurgerKing(Gastronomy g) {
        super(g);
        addVegetarianMenu("burgerKing/vegetarian.txt");
        addDietMenu("burgerKing/diet.txt");
        addItalianMenu("burgerKing/italian.txt");
        addFastFoodMenu("burgerKing/fastFood.txt");
        addGeneralMenu("burgerKing/general.txt");

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

        name = "Burger King";
    }
}



public class Driver {
    public static void main(String[] args) {
        Ingredient apple = new Ingredient("Apple", 0, IngredientType.Fruit, "n/a");
        Ingredient sugar = new Ingredient("Sugar", 0, IngredientType.Baking, "n.a");
        
        String chickenIID = IIDGenerator.genIID("Chicken", IngredientType.Protein, CookState.BAKED, CutState.CHOPPED, IngredientUnit.GRAM);

        System.out.println(apple);

        PantryStorage myPantry = new PantryStorage();

        myPantry.add(apple);

        myPantry.add(apple, 5);

        // myPantry.remove(apple, 2);

        // myPantry.add(sugar, 200);

        // System.out.println(myPantry.contains(sugar));

        System.out.println(myPantry);
        System.out.println(IIDGenerator.genIID(IngredientType.Dairy, "Milk"));
        System.out.println(chickenIID);
        System.out.println(IIDParser.getCookState(chickenIID));
    
    }
}
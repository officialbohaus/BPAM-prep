public class Driver {
    public static void main(String[] args) {
        Ingredient apple = new Ingredient("Apple", 0, IngredientType.Fruit, "n/a");
        Ingredient sugar = new Ingredient("Sugar", 0, IngredientType.Baking, "n.a");
        String[] ingredients; 
        int[] ingredientQuantity;
        String chicken, spinach, butter, chickenBaked, spinachBlanched, mashedPotatoes;
        int chickenQuantity, spinachQuantity, butterQuantity, unknownIngredient;

        ingredients = new String[3];

        chicken = IIDGenerator.genIID("Chicken", IngredientType.Protein, CookState.RAW, CutState.WHOLE, IngredientUnit.GRAM);
        spinach = IIDGenerator.genIID("Spinach", IngredientType.Veggie, CookState.RAW, CutState.WHOLE, IngredientUnit.GRAM);
        butter = IIDGenerator.genIID("Butter", IngredientType.Fat, IngredientUnit.MILLILITER);
        mashedPotatoes = IIDGenerator.genIID("MashedPotatoes", IngredientType.Veggie, CookState.STEWED, CutState.GROUND, IngredientUnit.GRAM);
        spinachBlanched = IIDGenerator.genIID("BlanchedSpinach", IngredientType.Veggie, CookState.STEAMED, CutState.WHOLE, IngredientUnit.GRAM);
        chickenBaked = IIDGenerator.genIID("BakedChicken", IngredientType.Protein, CookState.BAKED, CutState.WHOLE, IngredientUnit.GRAM);
        

        // String[] chickenIIDComponents = chicken.split("-");

        // for (String component : chickenIIDComponents) {
        //     System.out.println(component);
        // }


        System.out.println("Chicken IID: " + chicken);
        System.out.println("Spinach IID: " + spinach);
        System.out.println("Butter IID: " + butter);

        ingredients[0] = chicken;
        ingredients[1] = spinach;
        ingredients[2] = butter;

        System.out.println("\ngetEnum tests");
        System.out.println("Chicken type: " + IIDParser.getTypeEnum("Enum Type"));
        System.out.println("Chicken cook state: " + IIDParser.getCookStateEnum(chicken));
        System.out.println("Chicken cut state: " + IIDParser.getCutStateEnum(chicken));
        System.out.println("Chicken unit: " + IIDParser.getUnitEnum(chicken));

        System.out.println("\nCook and Cut Tests");
        RecipeBefore recipeBefore = new RecipeBefore(ingredients);
        System.out.println("Sliced Chicken: " + recipeBefore.slice(chicken));
        System.out.println("Baked Chicken: " + recipeBefore.bake("")); // error test
        System.out.println("Julienned Butter: " + recipeBefore.julienne(chicken));

        // setIngredientQuantity tests
        recipeBefore.setIngredientQuantity(chicken, 3);
        recipeBefore.setIngredientQuantity(spinach, 50);
        recipeBefore.setIngredientQuantity(butter, 0);

        unknownIngredient = recipeBefore.getIngredientQuantity("Sauce");
        chickenQuantity = recipeBefore.getIngredientQuantity(chicken);
        spinachQuantity = recipeBefore.getIngredientQuantity(spinach);
        butterQuantity = recipeBefore.getIngredientQuantity(butter);

        System.out.println(unknownIngredient);
        System.out.println(chickenQuantity);
        System.out.println(spinachQuantity);
        System.out.println(butterQuantity);

        // brads stuff
        String[] IIDComponentsIn = { CookState.RAW.getCookID(), "Chicken" };
        String IIDComponentOut = CookState.ROASTED.getCookID();
        Step roastChicken = new Step("Roast the chicken",  IIDComponentsIn, IIDComponentOut);

        IngredientSet setA = new IngredientSet("setA", chicken, spinach, butter);
        IngredientSet setB = new IngredientSet("setB", chickenBaked, spinachBlanched, butter, mashedPotatoes);

        System.out.println(setA.compare(setB));
        System.out.println(setB.compare(setA));

        //chicken = roastChicken.do(chicken);
    }
}
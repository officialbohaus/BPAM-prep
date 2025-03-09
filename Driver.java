

public class Driver {
    public static void main(String[] args) {
        Ingredient apple = new Ingredient("Apple", 0, IngredientType.Fruit, "n/a");
        Ingredient sugar = new Ingredient("Sugar", 0, IngredientType.Baking, "n.a");
        String[] ingredients; 
        int[] ingredientQuantity;
        String chicken, spinach, butter;
        int chickenQuantity, spinachQuantity, butterQuantity, unknownIngredient;

        ingredients = new String[3];

        chicken = IIDGenerator.genIID("Chicken", IngredientType.Protein, CookState.RAW, CutState.DICED, IngredientUnit.GRAM);
        spinach = IIDGenerator.genIID("Spinach", IngredientType.Veggie, CookState.RAW, CutState.WHOLE, IngredientUnit.GRAM);
        butter = IIDGenerator.genIID("Butter", IngredientType.Fat, IngredientUnit.MILLILITER);

        ingredients[0] = chicken;
        ingredients[1] = spinach;
        ingredients[2] = butter;

        // ingredientQuantity[0] = 300;
        // ingredientQuantity[1] = 5000;
        // ingredientQuantity[2] = 150;

        Recipe recipe = new Recipe(ingredients);

        recipe.setIngredientQuantity(chicken, 300);
        recipe.setIngredientQuantity(spinach, 5000);
        recipe.setIngredientQuantity(butter, 150);
        recipe.setIngredientQuantity("some food", 666);

        chickenQuantity = Integer.parseInt(recipe.getIngredientQuantity(chicken));
        spinachQuantity = Integer.parseInt(recipe.getIngredientQuantity(spinach));
        butterQuantity = Integer.parseInt(recipe.getIngredientQuantity(butter));
        unknownIngredient = Integer.parseInt(recipe.getIngredientQuantity("some food"));

        System.out.println("Chicken: "+ chickenQuantity);
        System.out.println("Spinach: " + spinachQuantity);
        System.out.println("Butter: " + butterQuantity);
        System.out.println("Some food: " + recipe.getIngredientQuantity("some food"));
    }
}
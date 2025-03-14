import Tags.CookState;
import Tags.CutState;

public class Driver {
    public static void main(String[] args) {
        Ingredient apple = new Ingredient("Apple", 0, IngredientType.FRUIT, "n/a");
        Ingredient sugar = new Ingredient("Sugar", 0, IngredientType.BAKING, "n.a");
        String[] ingredients; 
        int[] ingredientQuantity;
        String chicken, spinach, butter, chickenBaked, spinachBlanched, mashedPotatoes;
        int chickenQuantity, spinachQuantity, butterQuantity, unknownIngredient;

        ingredients = new String[3];

        chicken = IIDGenerator.genIID("Chicken", IngredientType.PROTEIN, CookState.RAW, CutState.WHOLE, IngredientUnit.GRAM);
        spinach = IIDGenerator.genIID("Spinach", IngredientType.VEGGIE, CookState.RAW, CutState.WHOLE, IngredientUnit.GRAM);
        butter = IIDGenerator.genIID("Butter", IngredientType.FAT, IngredientUnit.MILLILITER);
        mashedPotatoes = IIDGenerator.genIID("MashedPotatoes", IngredientType.VEGGIE, CookState.STEWED, CutState.GROUND, IngredientUnit.GRAM);
        spinachBlanched = IIDGenerator.genIID("BlanchedSpinach", IngredientType.VEGGIE, CookState.STEAMED, CutState.WHOLE, IngredientUnit.GRAM);
        chickenBaked = IIDGenerator.genIID("BakedChicken", IngredientType.PROTEIN, CookState.BAKED, CutState.WHOLE, IngredientUnit.GRAM);
        

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
        
       

        // setIngredientQuantity tests
  

       



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
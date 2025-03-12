import javax.management.RuntimeErrorException;

public class Recipe {
    /*
     * - The recipe class should take an ingredient set and pair each IID in the set
     * with a quantity value.
     * -This pairing can be done multiple ways, a matching array may be easy, the
     * PantryNode class already has this functionality too.
     * - The class should maintain some sort of "steps" for the recipe. Up to
     * programmer how to implement
     * - May be useful to have a RecipeStep class, that has ingredient in and
     * ingredient out, along with processing of said ingredient?
     * - The class should also have a recipe description and name.
     * - Appropriate getters, setter, and constructors
     * 
     */

    private IngredientSet[] ingredients;
    private int[] ingredientQty;
    private String[] ingredientString;
    private int index;
    private String description, name;

    // TODO: Implement description and name

    public Recipe(IngredientSet[] ingredients) {
        this.ingredients = ingredients;
        ingredientQty = new int[ingredients.length];
        ingredientString = new String[ingredients.length];

        for (int i = 0; i < ingredients.length; i++) {
            ingredientString[i] = ingredients[i].toString();
        }
    }

    public Recipe(String[] ingredientString) {
        this.ingredientString = ingredientString;
        ingredientQty = new int[ingredientString.length];
    }

    public void setIngredientQuantity(String ingredientName, int quantity) {
        for (int i = 0; i < ingredientString.length; i++) {
            if (ingredientName.equalsIgnoreCase(ingredientString[i])) {
                index = i;
            }
        }
        ingredientQty[index] = quantity;
    }

    // TODO: Duplicate arrays for encapsulation
    public String getIngredientQuantity(String ingredientName) {
        try {
            if (ingredientString.length != ingredientQty.length) {
                throw new IncompatibleArraysException("Incompatible arrays");
            }

            for (int i = 0; i < ingredientString.length; i++) {
                if (ingredientString[i].equalsIgnoreCase(ingredientName)) {
                    return Integer.toString(ingredientQty[i]);
                }
            }

        } catch (IncompatibleArraysException exception) {
            System.out.println(exception);
        } catch (RuntimeException exception) {
            System.out.println("Wrong name?");
        }

        return "Ingredient not found.";
    }

}

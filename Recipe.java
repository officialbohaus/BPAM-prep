import javax.management.RuntimeErrorException;

public class Recipe extends RecipeStep implements RecipeInterface {
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

    private IngredientSetInterface[] ingredients;
    private String description, name;

    // TODO: Implement description and name

    public Recipe(IngredientSetInterface[] ingredients) {
        super(new String[ingredients.length], new int[ingredients.length]);
        ingredients = new IngredientSetInterface[ingredients.length];
        ingredientQuantity = new int[ingredients.length];
        ingredientString = new String[ingredients.length];

        for (int i = 0; i < ingredients.length; i++) {
            this.ingredients[i] = ingredients[i];
            ingredientString[i] = ingredients[i].toString();
        }
    }

    public Recipe(String[] ingredientString) {
        super(ingredientString, new int[ingredientString.length]);
        ingredientString = new String[ingredientString.length];
        ingredientQuantity = new int[ingredientString.length];
        for (int i  = 0; i < ingredientString.length; i++) {
            this.ingredientString[i] = ingredientString[i];
        }
    }

    public void setIngredientQuantity(String ingredientName, int quantity) {
        for (int i = 0; i < ingredientString.length; i++) {
            if (ingredientName.equalsIgnoreCase(ingredientString[i])) {
                ingredientQuantity[i] = quantity;
            }
        }
    }

    // TODO: Duplicate arrays for encapsulation
    public int getIngredientQuantity(String ingredientName) {
        try {
            if (ingredientString.length != ingredientQuantity.length) {
                throw new IncompatibleArraysException("Incompatible arrays");
            }

            for (int i = 0; i < ingredientString.length; i++) {
                if (ingredientString[i].equalsIgnoreCase(ingredientName)) {
                    return ingredientQuantity[i];
                }
            }

        } catch (IncompatibleArraysException exception) {
            System.out.println(exception);
        } catch (RuntimeException exception) {
            System.out.println("Wrong name?");
        }

        return -1;
    }

    @Override
    public void setIngredient(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setIngredient'");
    }

    @Override
    public String getIngredient() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIngredient'");
    }

    @Override
    public void steps() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'steps'");
    }

}

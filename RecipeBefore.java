public class RecipeBefore extends CookAndCutAndShit implements RecipeInterface {
// TODO: Duplicate arrays for encapsulation
    
    public RecipeBefore(String[] ingredientString) {
        super(ingredientString, new int[ingredientString.length]);
    }

    public void setIngredientQuantity(String IID, int quantity) {
        // TODO if IID_LENGTH != 5, throw new InvalidNameException()
        if (IID.isEmpty()) { throw new InvalidNameException(); }
        if (quantity < 0) { throw new InvalidQuantityException(); }

        for (int i = 0; i < ingredientString.length; i++) {
            if (IID.equalsIgnoreCase(ingredientString[i])) {
                ingredientQuantity[i] = quantity;
            }
        } 
    }

    public int getIngredientQuantity(String IID) {
        // TODO if IID_LENGTH != 5, throw new InvalidNameException()
        if (IID.isEmpty()) { throw new InvalidNameException(); }

        try {
            for (int i = 0; i < ingredientString.length; i++) {
                if (IID.equalsIgnoreCase(ingredientString[i])) {
                    return ingredientQuantity[i];
                }
            }
            throw new InvalidNameException();
        } catch (InvalidNameException exception) {
            System.out.print(exception + " QUANTITY: ");
        }
        return -1;
    }

    @Override
    public void steps() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'steps'");
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
}

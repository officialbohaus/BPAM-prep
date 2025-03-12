public class RecipeBefore implements RecipeInterface {

    private String[] ingredientString;
    private int[] ingredientQuantity;

    public RecipeBefore(String[] ingredientString) {
        this.ingredientString = ingredientString;
        ingredientQuantity = new int[ingredientString.length];
    }

    public void setIngredientQuantity(String name, int quantity) {
        if (name.isEmpty()) { throw new InvalidNameException(); }
        if (quantity < 0) { throw new InvalidQuantityException(); }

        for (int i = 0; i < ingredientString.length; i++) {
            if (name.equalsIgnoreCase(ingredientString[i])) {
                ingredientQuantity[i] = quantity;
            }
        } 
    }

    public int getIngredientQuantity(String name) {
        if (name.isEmpty()) { throw new InvalidNameException(); }

        try {
            for (int i = 0; i < ingredientString.length; i++) {
                if (name.equalsIgnoreCase(ingredientString[i])) {
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
}

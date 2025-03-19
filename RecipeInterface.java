public interface RecipeInterface {
    public void setIngredientAndQuantity(String name, int quantity);
    public void setIngredientQuantity(String name, int quantity);
    public int getIngredientQuantity(String name);
}
public interface IngredientInterface {
    
    public String getID();

    public String getName();

    public IngredientType getType();

    public boolean isEqual(Ingredient ingredient);
}

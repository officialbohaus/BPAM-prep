import java.util.ArrayList;

public interface IngredientSetInterface {
    
    public ArrayList<String> getIngredients();

    public String getDescription();

    public ArrayList<String> compare(IngredientSet otherSet);
    
}

import java.util.ArrayList;

public interface IngredientSetInterface {
    
    public ArrayList<String> getIngredients();

    public void remove(String IID);

    public String getDescription();

    public ArrayList<String> compare(IngredientSet otherSet);

    public boolean contains(String IID);
    
}

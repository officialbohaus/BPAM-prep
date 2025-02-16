import java.util.ArrayList;

public class IngredientRegistry { 
    //This will store all created foodIDs for reusabilty.  

    private ArrayList<String> foodIDs = new ArrayList<>();

    public void addID(String id) {
        if (hasID(id)) { return; }
        foodIDs.add(id);
    }

    public void addItem(Ingredient ingredient) {
        addID(ingredient.getID());
    }

    public boolean hasItem(Ingredient ingredient) {
        return hasID(ingredient.getID());
    }

    public boolean hasID(String id) {
        for (String storedID : foodIDs) {
            if (id.equals(storedID)) { return true; }
        }
        return false;
    }

    public String toString() {
        String msg = "Food IDs:";
        for (String id : foodIDs) {
            msg += "\n - " + id;
        }
        return msg;
    }

}

import java.util.ArrayList;

public class PantryStorage {
    
    private ArrayList<PantryNode> pantryItems;

    public PantryStorage() {
        this.pantryItems = new ArrayList<PantryNode>();
    }

    public void add(Ingredient ingredient) {
        add(ingredient, 1);    
    }

    public void add(Ingredient ingredient, int qty) {
        for (PantryNode node : pantryItems) {
            if (node.isIngredient(ingredient)) {
                node.addQty(qty);
            }
        }
        // TODO error check to fix any multiple items here? 
        // could be done if ingredient node is found more than once b4 loop is done
    }

    public void remove(Ingredient ingredient) {
        remove(ingredient, 1);
    }

    public void remove(Ingredient ingredient, int qty) {
        for (PantryNode node : pantryItems) {
            if (node.isIngredient(ingredient)) {
                node.removeQty(qty);
            }
        }
    }



    public boolean contains(Ingredient ingredient) {
        return containsQty(ingredient) > 0;
    }

    public int containsQty(Ingredient ingredient) {
        for (PantryNode node : pantryItems) {
            if (node.isIngredient(ingredient)) {
                return node.getQty();
            }
        }
        return 0;
    }

    public String toString() {
        String msg = "Generated Report of Pantry:\n";
        for (PantryNode node : pantryItems) {
            msg += node.getQty() + " - " + node.getID();
            msg += "\n"; 
        }
        return msg;
    }




    /*
     * TODO
     * - able to add ingredient directly
     * - prevent dupe nodes
     * - qty 0 removes from storage (kept in registry)
     * - 
     */
}



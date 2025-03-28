import java.util.ArrayList;

public class PantryStorage {
    
    private ArrayList<PantryNode> pantryItems;

    // Constructor ========================================================================
    public PantryStorage() {
        this.pantryItems = new ArrayList<PantryNode>();
    }

    // Quantity Methods ===================================================================
    //      These methods take ingredient objects as arguments, however they are only used to get 
    //      their IIDs. The IIDs are then compared against the nodes we have in our pantryItems object,
    //      and the quantity is either changed or a new node is generated with that IID if no valid node
    //      is found.
    public void add(Ingredient ingredient) {
        add(ingredient, 1);    
    }

    public void add(Ingredient ingredient, int qty) {
        boolean foundNode = false;
        // just add to qty if node exists
        for (PantryNode node : pantryItems) {
            if (node.isIngredient(ingredient)) {
                node.addQty(qty);
                foundNode = true;
            }
        }
        // otherwise make a new node w/ qty
        if (!foundNode) {
            pantryItems.add(new PantryNode(ingredient, qty));
        }

        // TODO error check to fix any multiple items here? 
        // could be done if ingredient node is found more than once b4 loop is done
    }

    public void remove(Ingredient ingredient) {
        remove(ingredient, 1);
    }

    public void remove(Ingredient ingredient, int qty) {
        boolean foundNode = false;
        for (PantryNode node : pantryItems) {
            if (node.isIngredient(ingredient)) {
                node.removeQty(qty);
                foundNode = true;
            }
        }
        if (!foundNode) {
            System.out.println("No node with IID: " + ingredient.getID() + " found!");
        }
    }



    // Query Methods =========================================================================
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



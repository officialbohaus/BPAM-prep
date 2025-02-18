public class PantryNode {
    /* this represents each "box" for ingredients, it will combine an IID with a
     * quantity.
     */

     // TODO: bad practice to keep ingredient too? This may cause errors
     private final Ingredient ingredient;
     private final String IID;
     private int quantity;

     // Constructor ===========================================================================
     public PantryNode(Ingredient ingredient) {
        this(ingredient, 0);
     }

     public PantryNode(Ingredient ingredient, int quantity) {
        this.ingredient = ingredient;
        this.IID = ingredient.getID();
        this.quantity = quantity;
     }



     // Transaction Methods =======================================================================
     //  TODO: prevent negative qty and invalid transactions. Throw exceptions.
     public void removeQty() { removeQty(1); }

     public void removeQty(int quantity) {
        this.quantity -= quantity;
        // TODO throw error if removes too much
     }

     public void addQty() { addQty(1); }

     public void addQty(int quantity) {
        this.quantity += quantity;
     }

     public void setQty(int quantity) { this.quantity = quantity; }

     // Query Methods ==============================================================================
     public boolean isIngredient(Ingredient ingredient) {
      // if this ingredient id matches passed ingredient id
      return IID.equals(ingredient.getID());
     }

     public int getQty() { return quantity; }

     public String getID() { return IID; }




}

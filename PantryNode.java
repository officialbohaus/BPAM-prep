public class PantryNode {
    /* this represents each "box" for foods, it will combine a food item with a
     * quantity.
     */

     private Ingredient ingredient;
     private int quantity;

     public PantryNode(Ingredient ingredient) {
        this(ingredient, 0);
     }

     public PantryNode(Ingredient ingredient, int quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
     }

     public int getQty() { return this.quantity; }

     public String getID() { return ingredient.getID(); }

     public void setQty(int quantity) {
        this.quantity = quantity;
     }

     public void removeQty() { removeQty(1); }

     public void removeQty(int quantity) {
        this.quantity -= quantity;
        // TODO throw error if removes too much
     }

     public void addQty() { addQty(1); }

     public void addQty(int quantity) {
        this.quantity += quantity;
     }

     public boolean isIngredient(Ingredient ingredient) {
      // if this ingredient id matches passed ingredient id
      return this.ingredient.isEqual(ingredient);
     }


}

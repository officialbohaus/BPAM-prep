package src.main;
public class PantryNode {
    /* this represents each "box" for ingredients, it will combine an IID with a
     * quantity.
     */

     // TODO: bad practice to keep ingredient too? This may cause errors
     //private final Ingredient ingredient;
     private final String IID;
     private int quantity;
     //private final QuantityType qtyType;

     // Constructor ===========================================================================
     public PantryNode(Ingredient ingredient) {
        this(ingredient, 0);
     }

     public PantryNode(Ingredient ingredient, int quantity) {
        this(ingredient.getID(), quantity);
     }

     public PantryNode(String IID) {
         this(IID, 0);
     }

     public PantryNode(String IID, int quantity) {
         if (quantity < 0) { throw new IllegalArgumentException("Cannot create a PantryNode with quantity < 0"); }
         this.IID = IID;
         this.quantity = 0;
     }



     // Transaction Methods =======================================================================
     
     public void removeQty() { removeQty(1); }

     public void removeQty(int quantity) {
      if (quantity > this.quantity) { throw new IllegalArgumentException("Cannot remove " + quantity + " from " + this.quantity ); }
        this.quantity -= quantity;
        
     }

   public void addQty() { addQty(1); }

   public void addQty(int quantity) {
      if (quantity < 0) {
         throw new IllegalArgumentException();
      }
      this.quantity += quantity;
     }

   public void setQty(int quantity) { 
      if (quantity < 0) { throw new IllegalArgumentException("Quantity cannot be < 0"); }
      this.quantity = quantity; 
   }

     // Query Methods ==============================================================================
     public boolean isIngredient(Ingredient ingredient) {
      // if this ingredient id matches passed ingredient id
      return IID.equals(ingredient.getID());
     }

     public int getQty() { return quantity; }

     public String getID() { return IID; }




}

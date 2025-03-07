public class Ingredient implements IngredientInterface {
    private String id;
    private int qty;
    private String name;
    private IngredientType primaryType;
    private String details;    
    

    // Constructor
    public Ingredient(String name, int qty, IngredientType primaryType, String details) {
        this.name = name;
        this.qty = qty;
        this.primaryType = primaryType;
        this.details = details;
        this.id = primaryType.getTypeID() + "-" + name;
    }

    // getters
    public String getID() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public String getName() {
        return name;
    }

    public IngredientType getType() {
        return primaryType;
    }

    public String getDetails() {
        return details;
    }
    // getters

    // setter
    public void setID(int i) {}
    
    public void setQty(int qty) {
        if (qty < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.qty = 0;
    } 

    public void setName(String name) {}

    // public void setType() {}

    // public void setDetails() {}

    // setter

    // ++/-- methods
    public int increaseQty() {
        return ++qty;
    }

    public int decreaseQty() {
        if (qty > 0) {
            return qty--;
        }
        throw new IllegalStateException("Quantity cannot be negative.");
    }

    public String toString() {
        return "Ingrediant: " + name + "\n" + 
                    "id: " + id + "\n" + 
                    "qty: " + qty + "\n" + 
                    "Ingredient Type: " + primaryType + "\n" + 
                    "Details: " + details + "\n";

    }

    @Override
    public boolean isEqual(Ingredient ingredient) {
        return this.id.equals(ingredient.id);         
    }
}

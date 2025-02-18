import org.junit.Test;

public class PantryTests {

    // TODO: populate with unique IIDs once class is ready
    private final Ingredient INGREDIENT_A = new Ingredient();
    private final Ingredient INGREDIENT_B = new Ingredient();
    private final Ingredient INGREDIENT_C = new Ingredient();

    @Test
    void emptyIngredientCreated() {}
    private Ingredient createEmptyIngredient() {}

    @Test
    void ingredientACreated() {}
    private Ingredient createIngredientA() {}


    @Test
    void ingredientBCreated() {}
    private Ingredient createIngredientB() {}

    @Test
    void ingredientCCreated() {}
    private Ingredient createIngredientC() {}

    @Test
    void emptyPantryNodeCreated() {}
    private PantryNode createEmptyPantryNode() {}


    // PantryNode Tests ===========================================================
    @Test
    void pantryNodeACreated() {}
    private PantryNode createPantryNodeA() {}

    @Test
    void pantryNodeBCreated() {}
    private PantryNode createPantryNodeB() {}

    @Test
    void pantryNodeCCreated() {}
    private PantryNode createPantryNodeC() {}

    // @Test
    // void addA_NodeA() {}
    // private PantryNode addQtyOnNodeA() {}

    @Test
    void addQty100A_NodeA() {}
    

    // PantryStorage Tests (cross-nodes) (TODO: replace node tests below!)
    @Test
    void addAtoNodeA() {}

    @Test
    void addAtoNodeB() {}

    @Test
    void addBtoNodeA() {}

    @Test
    void addBtoNodeB() {}

    @Test
    void addQtyAtoNodeA() {}

    @Test 
    void addQtyAtoNodeB() {}

    @Test
    void addQtyBtoNodeA() {}

    @Test
    void addQtyBtoNodeB() {}

    @Test
    void addQty10BtoNodeB() {}

    @Test
    void addQty100BtoNodeB() {}

    @Test 
    void addQty1000BtoNodeB() {}

    @Test
    void removeAfromNodeA() {}

    @Test
    void removeAfromNodeB() {}

    @Test
    void removeBfromNodeA() {}

    @Test
    void removeBfromNodeB() {}

    @Test
    void removeSomeQtyAfromNodeA() {}

    @Test
    void removeSomeQtyAfromNodeB() {}

    @Test
    void removeAllQtyAfromNodeA() {}

    @Test
    void removeMoreThanAllQtyAfromNodeA() {}

    @Test
    void setQty100AonNodeA() {}
    

}

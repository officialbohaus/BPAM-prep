import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PantryTests {

    // TODO: populate with unique IIDs once class is ready

    // Shouldn't be generated here, rather should be the correct string. We test generation later.
    private final String IID_A = "#NAME:-INGREDIENTTYPE:-COOKSTATE:-CUTSTATE:-INGREDIENTUNIT:#";
    private final String IID_B = "#NAME:-INGREDIENTTYPE:-COOKSTATE:-CUTSTATE:-INGREDIENTUNIT:#";
    private final String IID_C = "#NAME:-INGREDIENTTYPE:-COOKSTATE:-CUTSTATE:-INGREDIENTUNIT:#";

    // IIDGenerator Tests =========================================================
    @Test
    void IID_A_Generated() {
        String genIID_A = IIDGenerator.genIID("Chicken", IngredientType.Protein, CookState.BAKED, CutState.CHOPPED, IngredientUnit.GRAM);
        assertTrue(genIID_A.compareTo(IID_A) == 0);
    }

    @Test
    void IID_B_Generated() {

    }

    @Test
    void IID_C_Generated() {

    }

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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.Test;

public class PantryTests {

    // TODO: populate with unique IIDs once class is ready

    // Shouldn't be generated here, rather should be the correct string. We test generation later.
    private final String IID_A = "#NAME:-INGREDIENTTYPE:-COOKSTATE:-CUTSTATE:-INGREDIENTUNIT:#";
    private final String IID_B = "#NAME:-INGREDIENTTYPE:-COOKSTATE:-CUTSTATE:-INGREDIENTUNIT:#";
    private final String IID_C = "#NAME:-INGREDIENTTYPE:-COOKSTATE:-CUTSTATE:-INGREDIENTUNIT:#";

    // IIDGenerator Tests =========================================================
    @Test
    public void IID_A_Generated() {
        String genIID_A = IIDGenerator.genIID("Chicken", IngredientType.PROTEIN, CookState.BAKED, CutState.CHOPPED, IngredientUnit.GRAM);
        // assertTrue(genIID_A.equals(IID_A));
        assertEquals(IID_A, genIID_A);
    }

    @Test
    public void IID_B_Generated() {
        String genIID_B = IIDGenerator.genIID("BakedApple", IngredientType.FRUIT, CookState.BAKED, CutState.WHOLE, IngredientUnit.UNIT);
        assertEquals(IID_B, genIID_B);
    }

    @Test
    public void IID_C_Generated() {
        String genIID_C = IIDGenerator.genIID("VanillaExtract", IngredientType.SPICE, IngredientUnit.MILLILITER);
        assertEquals(IID_C, genIID_C);
    }

    // PantryNode Tests ===========================================================
    
    // TODO likely better ways to test creation more robustly?
    @Test
    public void pantryNodeACreated() {
        assertNotNull(createPantryNodeA());
    }
    private PantryNode createPantryNodeA() {
        PantryNode node = new PantryNode(IID_A);
        return node;
    }

    
    @Test
    public void pantryNodeBCreated() {
        assertNotNull(createPantryNodeB());
    }
    private PantryNode createPantryNodeB() {
        PantryNode node = new PantryNode(IID_B);
        return node;
    }

    @Test
    public void pantryNodeCCreated() {
        assertNotNull(createPantryNodeC());
    }
    private PantryNode createPantryNodeC() {
        PantryNode node = new PantryNode(IID_C);
        return node;
    }

    @Test
    public void pantryNodeWithQuantityNeg1ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            createPantryNodeWithQuantity(IID_A, -1);
        });
    }

    @Test
    public void pantryNodeWithQuantity0Created() {
        // assertDoesNotThrow(() -> {
        //     createPantryNodeWithQuantity(IID_A, 0);
        // });
        assertNotNull(createPantryNodeWithQuantity(IID_A, 0));
    }

    @Test
    public void pantryNodeWithQuantity1Created() {
        assertNotNull(createPantryNodeWithQuantity(IID_A, 1));
    }
    private PantryNode createPantryNodeWithQuantity(String IID, int qty) {
        return new PantryNode(IID, qty);
    }

    @Test
    public void testName() {
        
    }

}

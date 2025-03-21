import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.Test;

public class PantryNodeTests {

    // TODO: populate with unique IIDs once class is ready

    // Shouldn't be generated here, rather should be the correct string. We test generation later.
    private final String IID_A = "#NAME:Chicken-INGREDIENTTYPE:PROTEIN-COOKSTATE:BAKE-CUTSTATE:CHOP-UNIT:g#";
    private final String IID_B = "#NAME:BakedApple-INGREDIENTTYPE:FRUIT-COOKSTATE:BAKE-CUTSTATE:WHOLE-UNIT:Ut#";
    private final String IID_C = "#NAME:VanillaExtract-INGREDIENTTYPE:SPICE-COOKSTATE:N/A-CUTSTATE:N/A-UNIT:mL#";

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
    public void pantryNodeGetQuantity() {
        PantryNode node = createPantryNodeWithQuantity(IID_A, 1);
        assertEquals(1, node.getQty());
    }

    // Transaction Methods Tests ==================================
    
    // removeQty()========================
    @Test
    public void pantryNodeRemoveQuantityFromQuantityOne() {
        PantryNode node = createPantryNodeWithQuantity(IID_A, 1);
        node.removeQty();
        assertEquals(0, node.getQty());
    }

    @Test
    public void pantryNodeRemoveQuantityZeroFromSetQuantityFive() {
        PantryNode node = createPantryNodeA();
        node.setQty(5);
        node.removeQty(0);
        assertEquals(5, node.getQty());
    }

    @Test
    public void pantryNodeRemoveQuantityFromQuantityZero() {
        PantryNode node = createPantryNodeA();
        assertThrows(IllegalArgumentException.class, () -> {
            node.removeQty();
        });
    }

    @Test
    public void pantryNodeRemoveQuantityTwoFromSetQuantityThree() {
        PantryNode node = createPantryNodeWithQuantity(IID_A, 3);
        node.removeQty(2);
        assertEquals(1, node.getQty());
    }

    //test for removing a negative throw an excetpion
    @Test
    public void pantryNodeRemoveNegativeQuantityFromQuantity() {
        PantryNode node = createPantryNodeA();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            node.removeQty(-1);
        });
        assertEquals("Cannot remove a negative quantity.", exception.getMessage());
    }

    //test for removing bigger number from smaller number AND the result WOULD be negative, 
    //throw an execetpion
    @Test
    public void pantryNodeRemoveGreaterQuantityFromLesserQuantity() {
    PantryNode node = createPantryNodeA();
    node.setQty(3);
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
        node.removeQty(5); // attempt to remove more than available
    });
    assertEquals("Cannot remove 5 from 3", exception.getMessage());
    }

    // addQty()===================
    @Test
    public void pantryNodeAddQuantity() {
        PantryNode node = createPantryNodeA();
        node.setQty(0); // corfirms node is at 0
        node.addQty();
        assertEquals(1, node.getQty());
    }

    @Test
    public void pantryNodeAddQuantityFive() {
        PantryNode node = createPantryNodeA();
        node.setQty(0); // corfirms node is at 0
        node.addQty(5);
        assertEquals(5, node.getQty());
    }

    @Test
    public void pantryNodeAddQuantityNegativeTwo() {
        PantryNode node = createPantryNodeA();
        node.setQty(0); // confirms node is at 0
        assertThrows(IllegalArgumentException.class, () -> {
            node.addQty(-2);
        });
    }

    // setQty()===============================
    @Test
    public void pantryNodeSetQuantityFive() {
        PantryNode node = createPantryNodeA();
        node.setQty(5);
        assertEquals(5, node.getQty());
    }

    @Test
    public void pantryNodeSetQuantityNegativeTwo() {
        PantryNode node = createPantryNodeA();
        assertThrows(IllegalArgumentException.class, () -> {
            node.setQty(-2);
        });
    }

    // Query Methods Tests===================================

    // @Test    This test is proven through the setQty() tests above
    // public void getQty() {}
    
    // @Test    
    // is meant to set a new ID to be passed in that would be true
    // public void isIngredientReturnsTrueForMatchingID() {
    //     PantryNode node = createPantryNodeA();
    //     node.setIID(IID_A);
    //     Ingredient ingredient = new Ingredient(IID_A, 0, null, IID_A);
    //     assertTrue(node.isIngredient(ingredient));
    // }

    // @Test
    // is meant to set a new ID to be passed in that would be false
    // public void isIngredientReturnsFalseForNon-MatchingID() {
    //     PantryNode node = createPantryNodeA();
    //     Ingredient ingredient = new Ingredient("RedApple", 1, IngredientType.FRUIT, "Apple");
    //     node.setIID("RedApple");
    //     assertTrue(node.isIngredient(ingredient));
    // }
    
    // @Test
    // public void getIDReturnsCorrectID() {
    //     PantryNode node = new PantryNode(IID_A);
    //     node.setIID("RedApple");
    //     assertEquals("RedApple", node.getID());
    // }
    
    // @Test
    // public void testName() {

    //     assert
    // }
}

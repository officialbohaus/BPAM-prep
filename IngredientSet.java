import java.util.ArrayList;

public class IngredientSet {
    /*
     * The IngredientSet represents a collection of ingredients.
     * - This class is intended to be used to group IIDs together as needed by user.
     *      - The relation between IIDs can be described in the description String, if desired
     *      - e.g. all IIDs related to a recipe, etc.
     * - The set does not need to maintain a quantity for any IID
     * - This class should have a method that compares it to another IngredientSet, returning the
     *   differences between the two.
     * - Should be able to add and remove IIDs from IngredientSet
     * - Should return a COPY of the IngredientSet array
     *      - return a copy, because returning the actual array will break encapsulation.
     * - Should have a description String that the user can choose to fill
     *      - This description should describe what relation all the IIDs have
     *      - Adherence to this relation within the set is maintained by the user, not by code.
     *          - (i.e. if the user decides the relation should be "vegan ingredients", and the user
     *              later adds eggs, the invalid relation is on them.)
     * - Should have appropriate getters and setters
     * - Constructor should be overloaded with multiple options
     *  - empty
     *  - multiple args
     *  - some pre-existing iterable of IIDs (TODO once iterables are covered in class)
     *  -- all with optional description counterpart (6 constructors total)
     */

    private ArrayList ingredients;
    
    public IngredientSet() {

    }

    public IngredientSet(IID) {
        
    }
}

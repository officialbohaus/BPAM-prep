import java.util.ArrayList;

public class IngredientSet implements IngredientInterface{
    /*
     * The IngredientSet represents a collection of ingredients.
     * - This class is intended to be used to group IIDs together as needed by user (we are the users).
     *      - The relation between IIDs can be described in the description String, if desired
     *      - e.g. all IIDs related to a recipe, etc.
     * - The set does not need to maintain a quantity for any IID
     * - This class should have a method that compares it to another IngredientSet, returning the
     *   differences between the two.
     *      - For now, lets return a String array with each difference found. Example:
     *          [Chicken-Pr-Raw --> Chicken-Pr-Bake]
     *          [     OTHER-IID --> THIS-IID       ]
     * - Should be able to add and remove IIDs from IngredientSet
     * - Should return a COPY of the IngredientSet array
     *      - return a copy, because returning the actual array will break encapsulation.
     * - Should have a description String that the user can choose to fill
     *      - This description should describe what relation all the IIDs have
     *      - Adherence to this relation within the set is maintained by the user, not by code.
     *          - (i.e. if the user decides the relation should be "vegan ingredients", and the user
     *              later adds eggs, the invalid relation is on them.)
     * - Should have appropriate getters and setters
     * - Constructor should be overloaded with multiple options to fill the set.
     *  - empty
     *  - multiple args
     *  - some pre-existing iterable of IIDs (TODO once iterables are covered in class)
     *  -- all with optional description counterpart (6 constructors total)
     */

    private ArrayList ingredients;
    
    public IngredientSet() {

    }

    public IngredientSet(String description, String... IID) {
        
    }

    @Override
    public String getID() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getID'");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public IngredientType getType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getType'");
    }

    @Override
    public boolean isEqual(Ingredient ingredient) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEqual'");
    }
}

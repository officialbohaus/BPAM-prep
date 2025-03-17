import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Step extends CookAndCutAndShit {
    
    private String description;
    private String[] criticalTags;
    private String IIDComponentsOut;
    private ArrayList<String> ingredientSet;
    private final int MIN_IID_COMPONENTS_IN_LENGTH = 1;
    private final int MAX_IID_COMPONENTS_IN_LENGTH = 3;

    // String[] criticalTags
    public Step(String description, String[] criticalTags, String IIDTagsOut) {
        this(description, criticalTags, IIDTagsOut, null);
    }
    

    public Step(String description, String[] criticalTags, String IIDTagsOut, IngredientSetInterface ingredientSet){
        /*
         * IIDComponentsIn cannot be empty
         * The component that is going in must be an existing component in the ingredient set
         */
        this.description = description;
        this.criticalTags = Arrays.copyOf(criticalTags, criticalTags.length);
        this.ingredientSet.addAll(ingredientSet.getIngredients());
    }

    public String doThis() {
        /* 
         *  Pass in IID String
         *  must return IID 
         *  The name of the ingredient coming in must be in ingredientSet

         *  If it is in ingredientSet, must change the cook and/or cut enum(s)
         *  in the IID of the ingredient coming in and return a String IID with changed enums 
         *  that match the requested changes (i.e. IIDComponentsOut)
         *  
            Use checkIIDComponentsIn() method to check the length of IIDCo
         *  Use the cook() and cut() methods as needed
         */
        for (int i = 0; i < ingredientSet.size(); i++) {
            String[] componentString = ingredientSet.get(i).toString().split("-");
            // if ()
        }
        return "";
    }

    private boolean hasTags(String IID) {
        // confirm we have the correct compponents of IID
        // if the IID contains all of criticalTags, method return true
        List<String> IIDTags = Arrays.asList(IIDParser.parseIID(IID));
        if (IIDTags.containsAll(Arrays.asList(criticalTags))) {
            return true;
        }
        return false;
    }

    private boolean checkTagsIn(String[] IIDTagsIn) {
        if (IIDTagsIn.length < MIN_IID_COMPONENTS_IN_LENGTH) { throw new InvalidIIDException(); }
        ArrayList<String> listOfTags;

        return true; // Added for testing
    }

    private int getIIDComponentsInLength(String IID) {
        return -1; // Added for testing
    }
}


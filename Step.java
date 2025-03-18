import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Tags.CookState;
import Tags.CutState;
import Tags.IIDTag;

public class Step extends CookAndCutAndShit {
    
    private String description, name;
    // private String[] criticalTags;
    private ArrayList<String> tagsAsString;
    private IIDTag IIDTagOut;
    private IIDTag[] tags;
    private final int MIN_IID_COMPONENTS_IN_LENGTH = 1;
    // private final int MAX_IID_COMPONENTS_IN_LENGTH = 3;

    
    public Step(String description, String name) {
        this(description, name, null);
    }
    
    public Step(String description, String name, IIDTag IIDTagOut) {
        this(description, name, null, IIDTagOut);
    }

    public Step(String description, String name, IIDTag[] tags, IIDTag IIDTagOut) {
        this.description = description;
        this.name = name;
        this.tags = Arrays.copyOf(tags, tags.length);
        this.IIDTagOut = IIDTagOut;
        tagsAsString = new ArrayList<>();
        for (IIDTag tag : tags) {
            tagsAsString.add(tag.toString());
        }
    }

    /*
     * IIDComponentsIn cannot be empty
     * The component that is going in must be an existing component in the ingredient set
     */

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
    public String doThis(String IID) {
        hasTags(IID);
        if (Arrays.asList(CookState.values()).contains(IIDTagOut)) {
            return cook(IID, IIDTagOut);
        } else if (Arrays.asList(CutState.values()).contains(IIDTagOut)) {
            return cut(IID, IIDTagOut);
        } else {
            throw new InvalidIIDException();
        }
    }

    // confirm we have the correct compponents of IID
    // if the IID contains all of criticalTags, method return true
    // if the IID DOES NOT contain all of criticalTags, method throws new exception
    private void hasTags(String IID) {
        Guards.checkIID(IID);
        ArrayList<IIDTag> IIDTags = new ArrayList<>();
        IIDTags.add(IIDParser.getCookStateEnum(IID));
        IIDTags.add(IIDParser.getCutStateEnum(IID));
        if (!IIDTags.containsAll(Arrays.asList(tags))) {
            throw new InvalidRequestException();
        }
    }

    // Check to see if the IIDTagsIn: 
    //  - are actual enums
    //  - is this necessary? 
    private boolean checkTagsIn(IIDTag[] IIDTagsIn) {
        for (IIDTag tagIn : IIDTagsIn) {
            if (!Arrays.asList(CookState.values()).contains(tagIn) && Arrays.asList(CutState.values()).contains(tagIn)) {
                return false;
            }
        }
        return true;
    }
}
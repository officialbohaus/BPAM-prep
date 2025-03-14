import java.util.ArrayList;
import java.util.Arrays;

public class Step extends CookAndCutAndShit {
    
    private String description;
    private String[] IIDComponentsIn;
    private String IIDComponentsOut;
    private ArrayList<String> ingredientSet;
    private final int MIN_IID_COMPONENTS_IN_LENGTH = 2;
    private final int MAX_IID_COMPONENTS_IN_LENGTH = 3;

    public Step(String description, String[] IIDComponentsIn, String IIDComponentsOut) {
        this.description = description;
        this.IIDComponentsIn = Arrays.copyOf(IIDComponentsIn, IIDComponentsIn.length);
    }

    public Step(String description, String[] IIDComponentsIn, String IIDComponentsOut, IngredientSetInterface ingredientSet){
        /*
         * IIDComponentsIn cannot be empty
         * The component that is going in must be an existing component in the ingredient set
         */
        this.IIDComponentsIn = Arrays.copyOf(IIDComponentsIn, IIDComponentsIn.length);
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

    private boolean hasComponents(String IID) {
        // confirm we have the correct compponents of IID

            return true;
    }

    private boolean checkIIDComponentsIn(String[] IIDComponentsIn) {
        if (IIDComponentsIn.length < MIN_IID_COMPONENTS_IN_LENGTH && IIDComponentsIn.length > MAX_IID_COMPONENTS_IN_LENGTH) { throw new InvalidIIDException(); }
        boolean isValidName, isValidCutState, isValidCookState;
        isValidName = isValidCutState = isValidCookState = false;
        int length = IIDComponentsIn.length;
        switch (length) {
            case 2: 
                for (int i = 0; i < ingredientSet.size(); i++) {
                    String[] IIDComponents = ingredientSet.get(i).split("-");
                    if (IIDComponents[0].equalsIgnoreCase(IIDComponentsIn[0])) {
                        isValidName = true;
                    }
                }
                if (!isValidName) { throw new InvalidIIDException(); }
                break;
            case 3:
                break;
            default:
                break;
        }
        return false; 
    }

    private int getIIDComponentsInLength(String[] IIDComponentsIn) {
        if (!checkIIDComponentsIn(IIDComponentsIn)) { throw new InvalidIIDException(); }
        return IIDComponentsIn.length;
    }
}


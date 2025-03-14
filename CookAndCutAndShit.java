import Tags.CookState;
import Tags.CutState;

public abstract class CookAndCutAndShit implements CookInterface, CutInterface {

    protected String[] ingredientString, ingredientsAfter; // stores ingredients before and after prep
    protected int[] ingredientQuantity;
    private String[] IIDComponents;
    static final String IID_ORDER = "name-ingtype-cook-cut-unit";
    private final int COOK_INDEX = 2;
    private final int CUT_INDEX = 3;
    private String newIID;

    // protected CookAndCutAndShit(String[] ingredientString, int[] ingredientQuantity) {
    //     // TODO Copy arrays
    //     this.ingredientString = new String[ingredientString.length];
    //     this.ingredientQuantity = new int[ingredientQuantity.length];
    //     for (int i = 0; i < ingredientString.length; i++) {
    //         this.ingredientString[i] = ingredientString[i];
    //         this.ingredientQuantity[i] = ingredientQuantity[i];
    //     }
    //     ingredientsAfter = new String[ingredientString.length];
    // }

    /* *
     * Cook Methods
     * TODO Provide guard statements and exception handling (e.g. if IID is not in a valid format)
     *      For valid IID Format, look at IID_ORDER
     */

    public String bake(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.BAKED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String fry(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.FRIED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String sautee(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.SAUTEED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String grill(String IID) {
        Guards.checkIID(IID);

        IIDComponents = IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.GRILLED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String roast(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.ROASTED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String smoke(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.SMOKED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String stew(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.STEWED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String steam(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.STEAMED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String toast(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.TOASTED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String cook(String IID) {
        CookState cookState = IIDParser.getCookStateEnum(IID);
        switch(cookState) {
            case BAKED:
                bake(IID);
                break;
            case FRIED:
                fry(IID);
                break;
            case SAUTEED:
                break;
            case GRILLED:
                grill(IID);
                break;
            case ROASTED:
                roast(IID);
                break;
            case SMOKED:
                smoke(IID);
                break;
            case STEWED:
                stew(IID);
                break;
            case STEAMED:
                steam(IID);
                break;
            case TOASTED:
                toast(IID);
                break;
        }
        return "ENUM NOT FOUND";
    }
    
/* ----------------------------------------------------------------------------------------------------------------- */
    /* *
     * Cut Methods
     * TODO Provide guard statements and exception handling (e.g if IID is not in a valid format)
     *      For valid IID Format, look at IID_ORDER
     */ 

    public String slice(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[CUT_INDEX] = CutState.SLICED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String chop(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[CUT_INDEX] = CutState.CHOPPED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String dice(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CutState.DICED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String mince(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[CUT_INDEX] = CutState.MINCED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String shred(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[CUT_INDEX] = CutState.SHREDDED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String ground(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[CUT_INDEX] = CutState.GROUND.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String julienne(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[CUT_INDEX] = CutState.JULIENNED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String cut(String IID) {
        CutState cutState = IIDParser.getCutStateEnum(IID);
        switch (cutState) {
            case SLICED:
                slice(IID);
                break;
            case CHOPPED:
                chop(IID);
                break;
            case DICED:
                dice(IID);
                break;
            case MINCED:
                mince(IID);
                break;
            case SHREDDED:
                shred(IID);
                break;
            case GROUND:
                ground(IID);
                break;
            case JULIENNED:
                julienne(IID);
                break; 
        }
        return "ENUM NOT FOUND";
    }
}
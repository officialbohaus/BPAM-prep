import Tags.CookState;
import Tags.CutState;
import Tags.IIDTag;

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

    public String boil(String IID) {
        Guards.checkIID(IID);

        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.BOILED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String cook(String IID, IIDTag cookState) {
        switch(cookState) {
            case CookState.RAW:
                return "THIS SHOULDN'T BE RAW.";
            case CookState.BAKED:
                bake(IID);
                break;
            case CookState.FRIED:
                fry(IID);
                break;
            case CookState.SAUTEED:
                sautee(IID);
                break;
            case CookState.GRILLED:
                grill(IID);
                break;
            case CookState.ROASTED:
                roast(IID);
                break;
            case CookState.SMOKED:
                smoke(IID);
                break;
            case CookState.STEWED:
                stew(IID);
                break;
            case CookState.STEAMED:
                steam(IID);
                break;
            case CookState.TOASTED:
                toast(IID);
                break;
            case CookState.BOILED:
                boil(IID);
                break;
            case CookState.NONE:
                return "THIS SHOULDN'T BE NONE.";
            default:
                return "THIS SHOULDN'T GET HERE.";
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

    public String cut(String IID, IIDTag cutState) {
        switch (cutState) {
            case CutState.WHOLE: 
                return "THIS SHOULDN'T BE WHOLE.";
            case CutState.SLICED:
                slice(IID);
                break;
            case CutState.CHOPPED:
                chop(IID);
                break;
            case CutState.DICED:
                dice(IID);
                break;
            case CutState.MINCED:
                mince(IID);
                break;
            case CutState.SHREDDED:
                shred(IID);
                break;
            case CutState.GROUND:
                ground(IID);
                break;
            case CutState.JULIENNED:
                julienne(IID);
                break; 
            case CutState.NONE:
                return "THIS SHOULDN'T BE NONE.";
            default:
                return "THIS SHOULDN'T GET TO THIS POINT.";
        }
        return "ENUM NOT FOUND";
    }
}
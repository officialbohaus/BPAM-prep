public abstract class RecipeStep implements CookInterface, CutInterface {

    protected String[] ingredientString, ingredientsAfter;
    protected int[] ingredientQuantity;
    private String[] IIDComponents;
    static final String IID_ORDER = "name-ingtype-cook-cut-unit";
    private final int CUT_INDEX;
    private final int COOK_INDEX;
    private String newIID;

    protected RecipeStep(String[] ingredientString, int[] ingredientQuantity) {
        this.ingredientString = ingredientString;
        this.ingredientQuantity = ingredientQuantity;
        ingredientsAfter = new String[ingredientString.length];
        COOK_INDEX = 2;
        CUT_INDEX = 3;
    }

    /* *
     * Cook Methods
     * TODO Provide guard statements and exception handling (e.g. if IID is not in a valid format)
     */

    @Override
    public String bake(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.BAKED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    @Override
    public String fry(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.FRIED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String sautee(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.SAUTEED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String roast(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.ROASTED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String smoke(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.SMOKED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String stew(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.STEWED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String steam(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.STEAMED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String toast(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CookState.TOASTED.getCookID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }
    
/* ----------------------------------------------------------------------------------------------------------------- */
    /* *
     * Cut Methods
     * TODO Provide guard statements and exception handling (e.g if IID is not in a valid format)
     */ 

    public String slice(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CutState.SLICED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String chop(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CutState.CHOPPED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String dice(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CutState.DICED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String mince(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CutState.MINCED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String shred(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CutState.SHREDDED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String ground(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CutState.GROUND.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String julienne(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[COOK_INDEX] = CutState.JULIENNED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }
}

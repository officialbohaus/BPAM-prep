public abstract class RecipeStep implements CookInterface, CutInterface {

    protected String[] ingredientString, ingredientsAfter; // stores ingredients before and after prep
    protected int[] ingredientQuantity;
    private String[] IIDComponents;
    static final String IID_ORDER = "name-ingtype-cook-cut-unit";
    private final int COOK_INDEX,CUT_INDEX;
    private String newIID;

    protected RecipeStep(String[] ingredientString, int[] ingredientQuantity) {
        // TODO Copy arrays
        this.ingredientString = new String[ingredientString.length];
        this.ingredientQuantity = new int[ingredientQuantity.length];
        for (int i = 0; i < ingredientString.length; i++) {
            this.ingredientString[i] = ingredientString[i];
            this.ingredientQuantity[i] = ingredientQuantity[i];
        }
        ingredientsAfter = new String[ingredientString.length];
        COOK_INDEX = 2;
        CUT_INDEX = 3;
    }

    /* *
     * Cook Methods
     * TODO Provide guard statements and exception handling (e.g. if IID is not in a valid format)
     *      For valid IID Format, look at IID_ORDER
     */

    public String bake(String IID) {
        try {
            Guards.checkIID(IID);

            IIDComponents =  IIDParser.parseIID(IID);
            IIDComponents[COOK_INDEX] = CookState.BAKED.getCookID();
            newIID = IIDParser.getIID(IIDComponents);
            return newIID;
        } catch (InvalidIIDException exception) {
            System.out.println(exception + ": " + IID);
        }
        return null;
    }

    public String fry(String IID) {
        try {
            Guards.checkIID(IID);

            IIDComponents =  IIDParser.parseIID(IID);
            IIDComponents[COOK_INDEX] = CookState.FRIED.getCookID();
            newIID = IIDParser.getIID(IIDComponents);
            return newIID;
        } catch (InvalidIIDException exception) {
            System.out.println(exception + ": " + IID);
        }
        return null;
    }

    public String sautee(String IID) {
        try {
            Guards.checkIID(IID);

            IIDComponents =  IIDParser.parseIID(IID);
            IIDComponents[COOK_INDEX] = CookState.SAUTEED.getCookID();
            newIID = IIDParser.getIID(IIDComponents);
            return newIID;
        } catch (InvalidIIDException exception) {
            System.out.println(exception + ": " + IID);
        }
        return null;
    }

    public String roast(String IID) {
        try {
            Guards.checkIID(IID);

            IIDComponents =  IIDParser.parseIID(IID);
            IIDComponents[COOK_INDEX] = CookState.ROASTED.getCookID();
            newIID = IIDParser.getIID(IIDComponents);
            return newIID;
        } catch (InvalidIIDException exception) {
            System.out.println(exception + ": " + IID);
        }
        return null;
    }

    public String smoke(String IID) {
        try {
            Guards.checkIID(IID);

            IIDComponents =  IIDParser.parseIID(IID);
            IIDComponents[COOK_INDEX] = CookState.SMOKED.getCookID();
            newIID = IIDParser.getIID(IIDComponents);
            return newIID;
        } catch (InvalidIIDException exception) {
            System.out.println(exception + ": " + IID);
        }
        return null;
    }

    public String stew(String IID) {
        try {
            Guards.checkIID(IID);

            IIDComponents =  IIDParser.parseIID(IID);
            IIDComponents[COOK_INDEX] = CookState.STEWED.getCookID();
            newIID = IIDParser.getIID(IIDComponents);
            return newIID;
        } catch (InvalidIIDException exception) {
            System.out.println(exception + ": " + IID);
        }
        return null;
    }

    public String steam(String IID) {
        try {
            Guards.checkIID(IID);

            IIDComponents =  IIDParser.parseIID(IID);
            IIDComponents[COOK_INDEX] = CookState.STEAMED.getCookID();
            newIID = IIDParser.getIID(IIDComponents);
            return newIID;
        } catch (InvalidIIDException exception) {
            System.out.println(exception + ": " + IID);
        }
        return null;
    }

    public String toast(String IID) {
        try {
            Guards.checkIID(IID);

            IIDComponents =  IIDParser.parseIID(IID);
            IIDComponents[COOK_INDEX] = CookState.TOASTED.getCookID();
            newIID = IIDParser.getIID(IIDComponents);
            return newIID;
        } catch (InvalidIIDException exception) {
            System.out.println(exception + ": " + IID);
        }
        return null;
    }
    
/* ----------------------------------------------------------------------------------------------------------------- */
    /* *
     * Cut Methods
     * TODO Provide guard statements and exception handling (e.g if IID is not in a valid format)
     *      For valid IID Format, look at IID_ORDER
     */ 

    public String slice(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[CUT_INDEX] = CutState.SLICED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String chop(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[CUT_INDEX] = CutState.CHOPPED.getCutID();
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
        IIDComponents[CUT_INDEX] = CutState.MINCED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String shred(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[CUT_INDEX] = CutState.SHREDDED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String ground(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[CUT_INDEX] = CutState.GROUND.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }

    public String julienne(String IID) {
        IIDComponents =  IIDParser.parseIID(IID);
        IIDComponents[CUT_INDEX] = CutState.JULIENNED.getCutID();
        newIID = IIDParser.getIID(IIDComponents);
        return newIID;
    }
}

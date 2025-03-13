public class IIDParser {
    
    // TODO: return appropriate enum types instead of strings
    // TODO: guard statements for getters

    static final String IID_ORDER = "name-ingtype-cook-cut-unit";
    private static String[] IIDComponents;
    private static final int NAME_INDEX = 0;
    private static final int TYPE_INDEX = 1;
    private static final int COOK_INDEX = 2;
    private static final int CUT_INDEX = 3;
    private static final int UNIT_INDEX = 4;
    private static final int IID_LENGTH = 5;
    
    public static String getName(String IID) {
        return getComponent(IID, NAME_INDEX);
    }

    public static String getID(String IID) {
        return IID;
    }

    public static String getType(String IID) {
        return getComponent(IID, TYPE_INDEX);
    }

    public static IngredientType getTypeEnum(String IID) {
        try {
            Guards.checkIID(IID);
            
            String type = getComponent(IID, TYPE_INDEX);
            
            return IngredientType.fromTypeID(type);
        } catch (InvalidIIDException exception) {
            System.out.println(exception + ": " + IID);
        }
        return null;
    }

    public static String getCookState(String IID) {
        return getComponent(IID, COOK_INDEX);
    } 

    public static CookState getCookStateEnum(String IID) {
        try {
            Guards.checkIID(IID);
            
            String type = getComponent(IID, COOK_INDEX);
            
            return CookState.fromCookID(type);
        } catch (InvalidIIDException exception) {
            System.out.println(exception + ": " + IID);
        }
        return null;

    }

    public static String getCutState(String IID) {
        return getComponent(IID, CUT_INDEX);
    }

    public static CutState getCutStateEnum(String IID) {
        try {
            Guards.checkIID(IID);
            
            String type = getComponent(IID, TYPE_INDEX);
            
            return CutState.fromCutID(type);
        } catch (InvalidIIDException exception) {
            System.out.println(exception + ": " + IID);
        }
        return null;        
    }

    public static String getUnit(String IID) {
        return getComponent(IID, UNIT_INDEX);
    }

    public static IngredientUnit getUnitEnum(String IID) {
        try {
            Guards.checkIID(IID);
            
            String type = getComponent(IID, TYPE_INDEX);
            
            return IngredientUnit.fromUnitID(type);
        } catch (InvalidIIDException exception) {
            System.out.println(exception + ": " + IID);
        }
        return null;                
    }

    public static String getIID(String[] IIDComponents) {
        String newIID;
        newIID = IIDComponents[0] + "-";
        for (int i = 1; i < IIDComponents.length; i++) {
            newIID += (i != IIDComponents.length - 1 ? (IIDComponents[i] + "-") : IIDComponents[i]);
        }
        return newIID;
    }

    public static String[] parseIID(String IID) {
        try {
            IIDComponents = IID.split("-");
            if (IIDComponents.length != IID_LENGTH) {
                throw new InvalidIIDException();
            } 
        } catch (InvalidIIDException exception) {
            System.out.println(exception);
        }
        return IIDComponents;
    }

    private static String getComponent(String IID, int position) {
        if (parseIID(IID).length != IID_LENGTH) {throw new InvalidIIDException();}
        // String[] IIDComponents = IID.split("-");
        String[] IIDComponents = parseIID(IID);
        return IIDComponents[position];
        // TODO: has no error checking
    }

}

    

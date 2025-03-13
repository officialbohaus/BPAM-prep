public class IIDParser {
    
    // TODO: return appropriate enum types instead of strings
    // TODO: guard statements for getters

    static final String IID_ORDER = "name-ingtype-cook-cut-unit";
    private static String[] IIDComponents;
    private static final int IID_LENGTH = 5;
    
    public static String getName(String IID) {
        return getComponent(IID, 0);
    }

    public static String getID(String IID) {
        return IID;
    }

    public static String getType(String IID) {
        return getComponent(IID, 1);
    }

    public static IngredientType getTypeEnum(String IID) {
        if (parseIID(IID).length != IID_LENGTH) {throw new InvalidIIDException();}

        String type = getComponent(IID, 1);
        
        return IngredientType.fromTypeID(type);
    }

    public static String getCookState(String IID) {
        return getComponent(IID, 2);
    } 

    public static CookState getCookStateEnum(String IID) {
        String cookState = getComponent(IID, 2);

        return CookState.fromCookID(cookState);
    }

    public static String getCutState(String IID) {
        return getComponent(IID, 3);
    }

    public static CutState getCutStateEnum(String IID) {
        String cutState = getComponent(IID, 3);

        return CutState.fromCutID(cutState);
    }

    public static String getUnit(String IID) {
        return getComponent(IID, 4);
    }

    public static IngredientUnit getUnitEnum(String IID) {
        String unit = getComponent(IID, 4);

        return IngredientUnit.fromunitID(unit);
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

    

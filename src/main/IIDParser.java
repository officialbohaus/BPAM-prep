package src.main;
// import Exceptions.InvalidIIDException;
// import Tags.CookState;
// import Tags.CutState;
// import Tags.IngredientType;
// import Tags.IngredientUnit;

public class IIDParser {
    
    // TODO: return appropriate enum types instead of strings
    // TODO: guard statements for getters

    static final String IID_ORDER = "name-ingtype-cook-cut-unit";
    private static String[] IIDTags;
    private static final int NAME_INDEX = 0;
    private static final int BASE_INDEX = 1;
    private static final int DESCRIPTOR_INDEX = 2;
    private static final int TYPE_INDEX = 3;
    private static final int COOK_INDEX = 4;
    private static final int CUT_INDEX = 5;
    private static final int UNIT_INDEX = 6;
    private static final int IID_LENGTH = 7;
    
    public static String getName(String IID) {
        Guards.checkIID(IID);

        return getTags(IID, NAME_INDEX);
    }

    public static String getBase(String IID) {
        Guards.checkIID(IID);

        return getTags(IID, BASE_INDEX);
    }

    public static String getDescriptor(String IID) {
        Guards.checkIID(IID);

        return getTags(IID, DESCRIPTOR_INDEX);
    }

    public static String getType(String IID) {
        Guards.checkIID(IID);
        
        return getTags(IID, TYPE_INDEX);
    }

    public static IngredientType getTypeEnum(String IID) {
        Guards.checkIID(IID);
        
        String type = getTags(IID, TYPE_INDEX);
        
        return IngredientType.fromTypeID(type);
    }

    public static String getCookState(String IID) {
        return getTags(IID, COOK_INDEX);
    } 

    public static CookState getCookStateEnum(String IID) {
        Guards.checkIID(IID);
        
        String type = getTags(IID, COOK_INDEX);
        
        return CookState.fromCookID(type);
    }

    public static String getCutState(String IID) {
        return getTags(IID, CUT_INDEX);
    }

    public static CutState getCutStateEnum(String IID) {
        Guards.checkIID(IID);
        
        String type = getTags(IID, CUT_INDEX);
        
        return CutState.fromCutID(type);
    }

    public static String getUnit(String IID) {
        return getTags(IID, UNIT_INDEX);
    }

    public static IngredientUnit getUnitEnum(String IID) {
        Guards.checkIID(IID);
        
        String type = getTags(IID, UNIT_INDEX);
        
        return IngredientUnit.fromUnitID(type);
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
        Guards.checkIID(IID);
        IIDTags = IID.split("-");
        return IIDTags;
    }

    private static String getTags(String IID, int position) {
        if (parseIID(IID).length != IID_LENGTH) {throw new InvalidIIDException();}
        // String[] IIDComponents = IID.split("-");
        String[] IIDComponents = parseIID(IID);
        return IIDComponents[position];
        // TODO: has no error checking
    }
}

    

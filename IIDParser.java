import Tags.CookState;
import Tags.CutState;

public class IIDParser {
    
    // TODO: return appropriate enum types instead of strings
    // TODO: guard statements for getters

    static final String IID_ORDER = "name-ingtype-cook-cut-unit";
    private static String[] IIDTags;
    private static final int ACTUAL_TAG_INDEX = 1;
    private static final int NAME_INDEX = 0;
    private static final int BASE_INDEX = 1;
    private static final int DESCRIPTOR_INDEX = 2;
    private static final int TYPE_INDEX = 3;
    private static final int COOK_INDEX = 4;
    private static final int CUT_INDEX = 5;
    private static final int UNIT_INDEX = 6;
    private static final int MAX_INDEX = 6;
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
        newIID = IIDComponents[0] + " - ";
        for (int i = 1; i < IIDComponents.length; i++) {
            newIID += (i != IIDComponents.length - 1 ? (IIDComponents[i] + " - ") : IIDComponents[i]);
        }
        return newIID;
    }

    public static String[] parseIID(String IID) {
        Guards.checkIID(IID);
        IIDTags = IID.split(" - ");
        return IIDTags;
    }

    // private static String getTags(String IID, int position) {
    //     if (parseIID(IID).length != IID_LENGTH) {throw new InvalidIIDException();}
    //     // String[] IIDComponents = IID.split("-");
    //     String[] IIDComponents = parseIID(IID);
    //     return IIDComponents[position];
    //     // TODO: has no error checking
    // }

    private static String getTags(String IID, int position) {
        if (parseIID(IID).length != IID_LENGTH) {throw new InvalidIIDException();}
        if (position < 0 || position > MAX_INDEX) {throw new IndexOutOfBoundsException();}

        switch (position) {
            case NAME_INDEX:
                String[] name = parseIID(IID)[NAME_INDEX].split(":");
                return name[ACTUAL_TAG_INDEX];
            case BASE_INDEX:
                String[] base = parseIID(IID)[BASE_INDEX].split(":");
                return base[ACTUAL_TAG_INDEX];
            case DESCRIPTOR_INDEX:
                String[] descriptor = parseIID(IID)[DESCRIPTOR_INDEX].split(":");
                return descriptor[ACTUAL_TAG_INDEX];
            case TYPE_INDEX:
                String[] type = parseIID(IID)[TYPE_INDEX].split(":");
                return type[ACTUAL_TAG_INDEX];
            case COOK_INDEX:
                String[] cookState = parseIID(IID)[COOK_INDEX].split(":");
                return cookState[ACTUAL_TAG_INDEX];
            case CUT_INDEX:
                String[] cutState = parseIID(IID)[CUT_INDEX].split(":");
                return cutState[ACTUAL_TAG_INDEX];
            case UNIT_INDEX:
                String[] unit = parseIID(IID)[UNIT_INDEX].split(":");
                return unit[ACTUAL_TAG_INDEX];
            default:
                throw new InvalidRequestException();
        }

        // TODO: has no error checking
    }
}

    

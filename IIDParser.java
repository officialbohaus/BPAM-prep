public class IIDParser {
    
    // TODO: return appropriate enum types instead of strings

    static final String IID_ORDER = "name-ingtype-cook-cut-unit";


    public static String getName(String IID) {
        return getComponent(IID, 0);
    }


    public static String getID(String IID) {
        return IID;
    }


    public static String getType(String IID) {
        return getComponent(IID, 1);
    }


    public static String getCookState(String IID) {
        return getComponent(IID, 2);
    } 


    public static String getCutState(String IID) {
        return getComponent(IID, 3);
    }


    public static String getUnit(String IID) {
        return getComponent(IID, 4);
    }

    private static String getComponent(String IID, int position) {
        String[] IIDComponents = IID.split("-");
        return IIDComponents[position];
        // TODO: has no error checking
    }


}

    

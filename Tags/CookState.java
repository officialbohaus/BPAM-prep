package Tags;
import java.util.ArrayList;

public enum CookState implements IIDTag {
    RAW("RAW"),
    BAKED("BAKE"),
    FRIED("FRY"),
    SAUTEED("SAUTE"),
    SEARED("SEAR"),
    GRILLED("GRILL"),
    ROASTED("ROAST"),
    SMOKED("SMOKE"),
    STEWED("STEW"),
    STEAMED("STEAM"),
    TOASTED("TOAST"),
    BOILED("BOIL"),
    NONE("N/A");

    private String cookID;

    private CookState(String cookID) {
        this.cookID = cookID;
    }

    public String getCookID() {
        return cookID;
    }

    // TODO Fix encapsulation? I may or may not be breaking encapsulation rules
    public static ArrayList<String> getCookStateArrayList() {
        ArrayList<String> cookStateArrayList = new ArrayList<String>();
        for (int i = 0; i < values().length; i++) {
            cookStateArrayList.add(values()[i].toString());
        }
        return cookStateArrayList;
    }
    
    public static String[] getCookIDString() {
        String[] cookIDString = new String[values().length];
        for (int i = 0; i < values().length; i++) {
            cookIDString[i] = values()[i].toString();
        }
        return cookIDString;
    }
    
    public static CookState fromCookID(String cookID) {
        for (CookState cookState : values()) {
            if (cookState.cookID.equalsIgnoreCase(cookID)) {
                return cookState;
            }
        }
        throw new IllegalArgumentException("No enum constant with abbreviation: " + cookID);
    }

    @Override
    public Class<IIDTag> getTypeTag() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTypeTag'");
    }

    @Override
    public String getTagText() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTagText'");
    }

    // @Override
    // public Class<> getTypeEnum() {
    //     return CookState.clwass;
    // }

    // @Override
    // public String getComponentText() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getComponentText'");
    // }
}
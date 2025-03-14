public enum CookState {
    RAW("RAW"),
    BAKED("BAKE"),
    FRIED("FRY"),
    SAUTEED("SAUTE"),
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

    public static CookState fromCookID(String cookID) {
        for (CookState cookState : values()) {
            if (cookState.cookID.equalsIgnoreCase(cookID)) {
                return cookState;
            }
        }
        throw new IllegalArgumentException("No enum constant with abbreviation: " + cookID);
    }
}
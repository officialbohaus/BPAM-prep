public enum CookState {
    RAW("R"),
    BAKED("Bak"),
    FRIED("Fri"),
    SAUTEED("Sau"),
    GRILLED("Grl"),
    ROASTED("Rst"),
    SMOKED("Smk"),
    TOASTED("Tst");

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
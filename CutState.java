public enum CutState {
    WHOLE("Wh"),
    SLICED("Sl"),
    CHOPPED("Ch"),
    DICED("Di"),
    MINCED("Min"),
    SHREDDED("Shr"),
    GROUND("Grd"),
    JULIENNED("Juli"),
    NONE("N/A");

    private String cutID;

    private CutState(String cutID) {
        this.cutID = cutID;
    }

    public String getCutID() {
        return cutID;
    }

    public static String[] getCutIDString() {
        String[] cutIDString = new String[values().length];
        for (int i = 0; i < values().length; i++) {
            cutIDString[i] = values()[i].toString();
        }
        return cutIDString;
    }

    public static CutState fromCutID(String cutID) {
        for (CutState cutState : values()) {
            if (cutState.cutID.equalsIgnoreCase(cutID)) {
                return cutState;
            }
        }
        throw new IllegalArgumentException("No enum constant with abbreviation: " + cutID);
    }

}
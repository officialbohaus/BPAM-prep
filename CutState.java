public enum CutState {
    WHOLE("WHOLE"),
    SLICED("SLICE"),
    CHOPPED("CHOP"),
    DICED("DICE"),
    MINCED("MINCE"),
    SHREDDED("SHRED"),
    GROUND("GROUND"),
    JULIENNED("JULIENNE"),
    NONE("N/A");

    private String cutID;

    private CutState(String cutID) {
        this.cutID = cutID;
    }

    public String getCutID() {
        return cutID;
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
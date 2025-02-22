public enum CutState {
    WHOLE("Wh"),
    SLICED("Sl"),
    CHOPPED("Ch"),
    DICED("Di"),
    MINCED("Min"),
    SHREDDED("Shr"),
    JULIENNED("Juli");

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
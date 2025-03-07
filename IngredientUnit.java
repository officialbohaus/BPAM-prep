public enum IngredientUnit {
    GRAM("Gr"),
    MILLILITER("Ml"),
    UNIT("Ut");

    private String unitID;

    private IngredientUnit(String unitID) {
        this.unitID = unitID;
    }

    public String getunitID() {
        return unitID;
    }

    public static IngredientUnit fromunitID(String unitID) {
        for (IngredientUnit UnitID : values()) {
            if (UnitID.unitID.equalsIgnoreCase(unitID)) {
                return UnitID;
            }
        }
        throw new IllegalArgumentException("No enum constant with abbreviation: " + unitID);
    }

}
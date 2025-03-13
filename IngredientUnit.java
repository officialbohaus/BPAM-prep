public enum IngredientUnit {
    GRAM("g"),
    MILLILITER("mL"),
    UNIT("Ut");

    private String unitID;

    private IngredientUnit(String unitID) {
        this.unitID = unitID;
    }

    public String getunitID() {
        return unitID;
    }

    public static IngredientUnit fromUnitID(String unitID) {
        for (IngredientUnit UnitID : values()) {
            if (UnitID.unitID.equalsIgnoreCase(unitID)) {
                return UnitID;
            }
        }
        throw new IllegalArgumentException("No enum constant with abbreviation: " + unitID);
    }

}
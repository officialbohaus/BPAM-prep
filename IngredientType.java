public enum IngredientType {
    Spice("Sp"),
    Grain("Gr"),
    Fruit("Fr"),
    Veggie("Vg"),
    Protein("Pr"),
    Dairy("Dy"),
    Baking("Bk"),
    Sauce("Sc"),
    Fat("Fat"),
    Nut("Nut"),
    Misc("Msc");
    private String typeID;
    private IngredientType(String typeID) { this.typeID = typeID; }
    public String getTypeID() { return typeID; }

    public static IngredientType fromTypeID(String typeID) {
        for (IngredientType ingredientType : values()) {
            if (ingredientType.typeID.equalsIgnoreCase(typeID)) {
                return ingredientType;
            }
        }
        throw new IllegalArgumentException("No enum constant with abbreviation:" + typeID);
    }
}

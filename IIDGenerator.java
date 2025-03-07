public class IIDGenerator {
    public static String genIID() {
        return "";
    }

    public static String genIID(IngredientType type, String name) {
        return type.getTypeID() + "-" + name;
    }

    public static String genIID(String itemName, IngredientType type, CookState cookState, CutState cutState, IngredientUnit unit) {
        return itemName + "-" + type.getTypeID() + "-" + cookState.getCookID() + "-" + cutState.getCutID() + "-" + unit.getunitID();
    }
}
public class IIDGenerator {
    public static String genIID() {
        return "";
    }

    public static String genIID(IngredientType type, String name) {
        return type.getTypeID() + "-" + name;
    }
}
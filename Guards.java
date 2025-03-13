import java.util.Arrays;
import java.util.List;

public class Guards {
    private static final int IID_LENGTH = 5;
    private static List<String> list;
    
    public static void checkIID(String IID) {
        String[] IIDComponents = IID.split("-");
        if (IIDComponents.length != IID_LENGTH) {
            throw new InvalidIIDException();
        }
    }

    public static void checkCutEnum(String IID) {
        list = Arrays.asList(CutState.getCutIDString());
        if (!list.contains(IIDParser.getCutState(IID))) { // Maybe use getComponent()
            throw new InvalidIIDException();
        }
    }

    public static void checkTypeEnum(String IID) {
        list = Arrays.asList(IngredientType.getTypeString());
        if (!list.contains(IIDParser.getType(IID))) { // Maybe use getComponent()?
            throw new InvalidIIDException();
        }

    }

    public static void checkCookEnum(String IID) {

    }
}

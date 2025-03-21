package src.main;
import java.util.Arrays;
import java.util.List;

// import Exceptions.InvalidIIDException;
// import IID.IIDParser;
// import Tags.CutState;
// import Tags.IngredientType;

public class Guards {
    private static final int IID_LENGTH = 8; // TODO remember to change this if we change IID!
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

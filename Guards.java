public class Guards {
    private static final int IID_LENGTH = 5;
    
    public static void checkIID(String IID) {
        String[] IIDComponents = IID.split("-");
        if (IIDComponents.length != IID_LENGTH) {
            throw new InvalidIIDException();
        }
    }

}

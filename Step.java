import java.util.Arrays;

public class Step {
    
    private String description;
    private String[] IIDComponentsIn;
    private String[] IIDComponentsOut;


    public Step(String description, String[] IIDComponentsIn, String IIDComponentOut) {
        this.description = description;
        this.IIDComponentsIn = Arrays.copyOf(IIDComponentsIn, IIDComponentsIn.length);
        this.IIDComponentsOut = Arrays.copyOf(IIDComponentsOut, IIDComponentsOut.length);
    }

    public String do(String IID) {
        // convert IID components to state of IID after step is done(components out)
    }

    private boolean hasComponents(String IID) {
        // confirm we have the correct compponents of IID
    }
}

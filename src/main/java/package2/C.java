package package2;
import package1.*;

public class C {
    // everything that is public is visible to all packages in the project
    public String publicMessage = "This is a public announcement";
    // Protected -is accessible to a different class as long as the class is a subclass to it no matter the package
    protected String protectedMessage = "This is protected info";
    private String privateMessage = "This is so secretive,you can't see it";
    String defaultMessage = "This is the default ";
}



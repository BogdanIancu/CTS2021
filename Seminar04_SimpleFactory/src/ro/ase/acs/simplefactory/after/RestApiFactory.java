package ro.ase.acs.simplefactory.after;

public class RestApiFactory {

    public static final String DEVELOPMENT = "development";
    public static final String RELEASE = "release";

    public static RestApi createConnection(String serverType){
        if(DEVELOPMENT.equals(serverType)){
            return new RestApiDevelopment();
        } else if(RELEASE.equals(serverType)){
            return new RestApiRelease();
        }
        return null;
    }

}

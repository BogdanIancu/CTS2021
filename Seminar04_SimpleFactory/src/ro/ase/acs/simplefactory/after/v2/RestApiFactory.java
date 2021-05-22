package ro.ase.acs.simplefactory.after.v2;

public class RestApiFactory {
   public RestApi createConnection(ServerType serverType){
        if(serverType == ServerType.DEVELOPMENT){
            return new RestApiDevelopment();
        } else if(serverType == ServerType.RELEASE){
            return new RestApiRelease();
        }
        return null;
    }
}

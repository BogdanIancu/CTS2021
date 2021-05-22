package ro.ase.acs.simplefactory.after;

public class RestApiDevelopment implements RestApi {

    public RestApiDevelopment(){
        System.out.println("ApiDevelopment");
    }

    @Override
    public void connect(){
        System.out.println("Connected successfully");
    }
}

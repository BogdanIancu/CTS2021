package ro.ase.acs.simplefactory.after;

public class RestApiRelease implements RestApi {

    public RestApiRelease(){
        System.out.println("ApiRelease");
    }

    @Override
    public void connect(){
        System.out.println("Connected successfully");
    }
}

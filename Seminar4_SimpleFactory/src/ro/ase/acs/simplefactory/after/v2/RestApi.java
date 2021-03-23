package ro.ase.acs.simplefactory.after.v2;

public abstract class RestApi {
	
	public RestApi() {
		System.out.println(getName());
	}
	
	public abstract String getName();
	
    public void connect(){
        System.out.println("Connected successfully");
    }
}

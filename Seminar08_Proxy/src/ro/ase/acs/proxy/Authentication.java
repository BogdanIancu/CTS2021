package ro.ase.acs.proxy;

public interface Authentication {
	public boolean login(String username, String password) 
			throws SecurityAuthenticationException;
}

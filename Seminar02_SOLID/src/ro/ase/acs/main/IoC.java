package ro.ase.acs.main;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class IoC {
	private Map<Class<?>, Class<?>> map = new HashMap<>();
	
	public void register(Class<?> contract, Class<?> implementation) {
		map.put(contract, implementation);
	}
	
	public <T> T resolve(Class<?> contract) {
		Class<?> implementation = map.get(contract);
		try {
			Object obj = implementation.getConstructor().newInstance();
			if(implementation.isInstance(obj)) {
				return (T)obj;
			}
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
}

package ro.ase.acs.strategy;

@FunctionalInterface
public interface Operation {
	public long applyOperation(Integer[] array);
}
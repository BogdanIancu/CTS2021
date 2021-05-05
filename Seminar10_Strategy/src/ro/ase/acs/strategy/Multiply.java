package ro.ase.acs.strategy;

public class Multiply implements Operation {

	@Override
	public long applyOperation(Integer[] array) {
		long product = 1;
		for(int i = 0; i < array.length; i++) {
			product *= array[i];
		}
		return product;
	}

}

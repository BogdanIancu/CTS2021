package ro.ase.acs.strategy;

public class Sum implements Operation {

	@Override
	public long applyOperation(Integer[] array) {
		long sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
}

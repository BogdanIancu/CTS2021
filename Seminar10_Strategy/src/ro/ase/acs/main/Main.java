package ro.ase.acs.main;

import ro.ase.acs.strategy.Calculator;
import ro.ase.acs.strategy.Multiply;
import ro.ase.acs.strategy.Sum;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.addValue(3);
		calculator.addValue(4);
		calculator.addValue(5);
		
		calculator.setOperation(new Sum());
		System.out.println(calculator.operate());
		
		calculator.setOperation(new Multiply());
		System.out.println(calculator.operate());
		
		calculator.setOperation(array -> {
			long sum = 0;
			for(int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			return sum / array.length;
		});
		System.out.println(calculator.operate());
	}

}

package ro.ase.acs.main;

import ro.ase.acs.builder.Product;
import ro.ase.acs.builder.ProductBuilderV2;

public class Main {
	public static void main(String[] args) {
//		Product product = new Product("milk", 10, 12345, 23, null, 0, false, true, true);
//		Product product2 = new Product("chocolate", 7);
//		product2.setQuantity(10);
//		product2.setBarCode(1232132);
//		//...
//		product2.setExpireDate(new Date());

		Product product3 = new Product.ProductBuilder()
				.addName("milk")
				.addBarCode(12345)
				.addQuantity(23)
				.addIsVegetarianFriendly(true)
				.addIsGlutenFree(true)
				.build();
		System.out.println(product3);

		ProductBuilderV2 builder = new ProductBuilderV2();
		builder.addName("chocolate");
		builder.addPrice(7);
		builder.addQuantity(10);
		builder.addBarCode(1232132);
		Product product4 = builder.build();
		System.out.println(product4);
	}
}

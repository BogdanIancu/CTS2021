package ro.ase.acs.builder;

import java.util.Date;

public class ProductBuilderV2 {
	private String name;
	private float price;
	private long barCode;
	private int quantity;
	private Date expireDate;
	private float discount;
	private boolean isVeganFriendly;
	private boolean isVegetarianFriendly;
	private boolean isGlutenFree;

	public ProductBuilderV2 addName(String name) {
		this.name = name;
		return this;
	}

	public ProductBuilderV2 addPrice(float price) {
		this.price = price;
		return this;
	}

	public ProductBuilderV2 addBarCode(long barCode) {
		this.barCode = barCode;
		return this;
	}

	public ProductBuilderV2 addQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public ProductBuilderV2 addExpireDate(Date expireDate) {
		this.expireDate = expireDate;
		return this;
	}

	public ProductBuilderV2 addDiscount(float discount) {
		this.discount = discount;
		return this;
	}

	public ProductBuilderV2 addIsVeganFriendly(boolean isVeganFriendly) {
		this.isVeganFriendly = isVeganFriendly;
		return this;
	}

	public ProductBuilderV2 addIsVegetarianFriendly(boolean isVegetarianFriendly) {
		this.isVegetarianFriendly = isVegetarianFriendly;
		return this;
	}

	public ProductBuilderV2 addIsGlutenFree(boolean isGlutenFree) {
		this.isGlutenFree = isGlutenFree;
		return this;
	}

	public Product build() {
		return new Product(name, price, barCode, quantity, expireDate, discount, isVeganFriendly, isVegetarianFriendly,
				isGlutenFree);
	}
}

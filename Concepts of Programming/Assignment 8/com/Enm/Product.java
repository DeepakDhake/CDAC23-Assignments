package com.Enm;

public class Product {
	private int id;
	private String name;
	private double price;
	private CategoryGross cat;

	public Product(int id, String name, double price, CategoryGross cat) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.cat = cat;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public CategoryGross getCat() {
		return cat;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", cat=" + cat + "]";
	}

}

package com.sample.watch;

public class WatchNTT {
	
	private int id;
	private String brand;
	private int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String material;
	private String color;
	private boolean isWarranty;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isWarranty() {
		return isWarranty;
	}
	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	
	

}

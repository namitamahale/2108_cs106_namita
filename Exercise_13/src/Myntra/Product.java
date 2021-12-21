package Myntra;

public class Product {
	
	private String prodNm, colour, size, gender;
	private double price;
	Brand brand;
	Category category;
	
	SubCategory subcategory;
	public Product(String prodNm, String colour, String size, String gender, double price, Brand brand, Category category,
			SubCategory subcategory) {
		super();
		this.setProdNm(prodNm);
		this.setColour(colour);
		this.setSize(size);
		this.setGender(gender);
		this.setPrice(price);
		this.brand = brand;
		this.category = category;
		this.subcategory = subcategory;
	}
	public String getProdNm() {
		return prodNm;
	}
	public void setProdNm(String prodNm) {
		this.prodNm = prodNm;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category.getName();
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Brand getBrand()
	{
		return brand;
	}
	
	

}

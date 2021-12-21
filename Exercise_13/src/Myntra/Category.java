package Myntra;

public class Category {
	
	private String name;
	private SubCategory[] subcategory;
	
	
	
	public Category (String name, SubCategory[] subcategory)
	{
		this.name = name;
		this.subcategory= subcategory;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SubCategory[] getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(SubCategory[] subcategory) {
		this.subcategory = subcategory;
	}

}

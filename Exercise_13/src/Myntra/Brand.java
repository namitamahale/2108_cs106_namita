package Myntra;

public class Brand {
	
	private String brandName, countryOfOrigin;
	
	public Brand(String brandName, String countryOfOrigin)
	{
		this.brandName=brandName;
		this.setCountryOfOrigin(countryOfOrigin);
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

}

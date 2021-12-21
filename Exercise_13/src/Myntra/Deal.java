package Myntra;

import java.util.ArrayList;
import java.util.List;

public class Deal {
	
	List<Product> product;
	
	public Deal()
	{
		this.product= new ArrayList<Product>();
	}
	
	
	public void addproduct(Product product)
	{
		this.product.add(product);
	}
	
	

}

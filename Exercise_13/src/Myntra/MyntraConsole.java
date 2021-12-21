package Myntra;

import java.util.ArrayList;
import java.util.List;



public class MyntraConsole {
	
	private List<Category> listOfcategories;
	private List<Brand> listOfBrands;
	private List<Deal> deals;
	private List<Product> listOfProducts;
	private List<Product> wishlist;
	private List<Product> cart;
	
	
	
	
	public MyntraConsole(List<Category> listOfcategories, List<Brand> listOfBrands, List<Deal> deals,
			List<Product> listOfProducts) {
		super();
		this.setListOfcategories(listOfcategories);
		this.setListOfBrands(listOfBrands);
		this.deals = deals;
		this.listOfProducts = listOfProducts;
		this.wishlist = new ArrayList<Product>();
		this.cart = new ArrayList<Product>();
		
	}
	
	
	//searching product
	public void searchProduct(String name)
	{
		int count=0;
		
		System.out.println("\nSEARCHED FOR - " +name);
		for(int i=0; i<listOfProducts.size();i++)
		{
			
			if (listOfProducts.get(i).getProdNm()==name)
			{
				count++;
				System.out.println("\n"+name+"  "+listOfProducts.get(i).getPrice()+" Rs/-");
				
			}
			
	    }
		System.out.println("\n"+count+" results found \n");
		System.out.println("\n***************************\n");
	}
	
	
	//searching category
	public void searchCategory(String name)
	{
		
		//for(int i=0; i<=listOfProducts.size();i++)
		int i=0;
		int count=0;
		if (listOfProducts.size()==0)
		{
			System.out.println("no products");
		}
		else
		{
		for(i=0;i<listOfProducts.size();i++)
		{
			if (listOfProducts.get(i).getCategory()==name)
			{
				count++;
				System.out.println("\n "+ listOfProducts.get(i).getProdNm()+"  "+listOfProducts.get(i).getPrice()+" Rs/-");
				
				
				//break;	
			}
			
			
			
	    }
		}
		System.out.println("\n"+count+" results found \n");
		System.out.println("\n***************************\n");
	}
	
	
	//filtersearching 
	public void filtersearch(String size, String Colour, String gender, Brand brand, double pricelow, double pricehigh)
	{
		System.out.println("SEARCH RESULTS FOR - \n"+size+ " size \n"+ Colour+ " colour \n"+"gender- "  +gender+ "\nbrand- "+brand.getBrandName()+"\nprice range -"+pricelow+" to " +pricehigh);
		int count=0;
		for (int i=0;i<listOfProducts.size();i++)
		{
			if(listOfProducts.get(i).getSize()==size && listOfProducts.get(i).getColour()==Colour && listOfProducts.get(i).getGender()==gender && listOfProducts.get(i).getBrand()==brand && listOfProducts.get(i).getPrice()>=pricelow && listOfProducts.get(i).getPrice()<=pricehigh)
			{
				count++;
				
				System.out.println("\n "+listOfProducts.get(i).getProdNm()+"  "+listOfProducts.get(i).getPrice()+" Rs/-");
				
			}
			
			
		}
		System.out.println("\n"+count+" results found \n");
		System.out.println("\n***************************\n");
	}
	
	
	//filtersearching by price only 
	public void filtersearch(double pricelow, double pricehigh)
	{
		
		System.out.println("\n SEARCHED FOR THE PRICE RANGE "+pricelow+" to "+pricehigh);
		
		int count=0;
		
		for (int i=0;i<listOfProducts.size();i++)
		{
			
			if(listOfProducts.get(i).getPrice()>=pricelow && listOfProducts.get(i).getPrice()<=pricehigh)
			{
				count++;
				
				
				
				System.out.println("\n "+listOfProducts.get(i).getProdNm()+"  "+listOfProducts.get(i).getPrice()+" Rs/-");
				
			}
			
		
		}
		System.out.println("\n"+count+" results found \n");
		System.out.println("\n***************************\n");
		
	}
	
	
	
	//adding items to the wishlist
	public void addToWishlist(Product prodname)
	{
		for(int i=0; i<listOfProducts.size();i++)
		{
			if (listOfProducts.get(i)==prodname)
			{
				wishlist.add(listOfProducts.get(i));
				System.out.println(listOfProducts.get(i).getProdNm()+" added to the wishlist");
				System.out.println("\n***************************\n");
				
			}
			
		}
		
		
	}
	
	
	// displaying the wishlist
	public void DisplayWishlist()
	{
		if (wishlist.size()!=0)
		{
			System.out.println("\n YOUR WISHLIST ");
			for(int i=0; i<wishlist.size();i++)
			{
				
				System.out.println("\n" +wishlist.get(i).getProdNm()+"   "+wishlist.get(i).getPrice()+" Rs/-");
			}
		}
		else 
		{
		System.out.println("your wishlist is empty \n");
		System.out.println("\n***************************\n");
		}
		System.out.println("\n***************************\n");
	}
	
	
	//deleting items from the wishlist
	public void deleteformWishlist(Product prodname)
	{
		if (wishlist.size()!=0)
		{
			//System.out.println("\n YOUR WISHLIST \n");
			for(int i=0; i<wishlist.size();i++)
			{
				if(wishlist.get(i)==prodname)
				{
					System.out.println("\n"+wishlist.get(i).getProdNm()+" removed from your wishlist \n");
					wishlist.remove(i);
					;
					
				}
				
				
			}
		}
		else 
		{
		System.out.println("\nyour wishlist is empty \n");
		}
		System.out.println("\n***************************\n");
	}
	
	
	//adding items to the cart
	public void addtocart(Product prodname)
	{
		for(int i=0; i<listOfProducts.size();i++)
		{
			if (listOfProducts.get(i)==prodname)
			{
				this.cart.add(listOfProducts.get(i));
				System.out.println(listOfProducts.get(i).getProdNm()+" added to the cart \n");
			}
		}
		System.out.println("\n***************************\n");
	}
	
	
	//displaying items from the cart
	public void showcart()
	{
		
		if (cart.size()!=0)
		{
			System.out.println("\n YOUR CART ");
			for(int i=0; i<cart.size();i++)
			{
				
				System.out.println("\n" +cart.get(i).getProdNm()+"   "+cart.get(i).getPrice()+" Rs/-");
			}
		}
		else 
		{
		System.out.println("your cart is empty \n");
		}
		System.out.println("\n***************************\n");
		
	}
	
	
	//deleting items from the cart
	public void deleteformCart(Product prodname)
	{
		if (cart.size()!=0)
		{
			//System.out.println("\n YOUR WISHLIST \n");
			for(int i=0; i<cart.size();i++)
			{
				if(cart.get(i)==prodname)
				{
					System.out.println("\n"+cart.get(i).getProdNm()+" removed from your cart \n");
					cart.remove(i);
					
				}
				
				
			}
		}
		else 
		{
		System.out.println("your cart is empty \n");
		}
		System.out.println("\n***************************\n");
	}
	
	
	//displaying deals
	public void showdeals()
	{
		if (this.deals.size()!=0)
		{
			System.out.println("\n ---DEALS--- \n");
			for(int i=0;i<deals.size();i++)
			{
				if(deals.get(i).product.size()!=0)
				{
					for(int j=0; j<deals.get(i).product.size();j++)
					{
						System.out.println("\n"+deals.get(i).product.get(j).getProdNm()+"   "+deals.get(i).product.get(j).getPrice()+" Rs/-");
					}
				}
				else
				{
					System.out.println("there are no deals \n");
				}
			}
		}
		else 
		{
			System.out.println("there are no deals \n");
		}
		System.out.println("\n***************************\n");
	}

	public List<Category> getListOfcategories() {
		return listOfcategories;
	}

	public void setListOfcategories(List<Category> listOfcategories) {
		this.listOfcategories = listOfcategories;
	}

	public List<Brand> getListOfBrands() {
		return listOfBrands;
	}

	public void setListOfBrands(List<Brand> listOfBrands) {
		this.listOfBrands = listOfBrands;
	}

}

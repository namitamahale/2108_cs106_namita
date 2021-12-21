package ClientSide;

import Myntra.SubCategory;
import Myntra.Category;
import Myntra.Product;

import java.util.ArrayList;
import java.util.List;

import Myntra.Brand;
import Myntra.Deal;
import Myntra.MyntraConsole;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SubCategory[] listOfSubCatMen = {new SubCategory("t-shirts"),
				                         new SubCategory("casuals"), 
				                         new SubCategory("formals"), 
				                         new SubCategory("jackets")};
	
		SubCategory[] listOfSubCatWomen = {new SubCategory("salwars"),
                						new SubCategory("churidars"), 
                						new SubCategory("sarees"), 
                						new SubCategory("lehengas")};
		
		SubCategory[] listOfSubCatKids = {new SubCategory("trousers"),
                						new SubCategory("partyWear"), 
                						new SubCategory("nightWear"), 
                						new SubCategory("shorts")};

		SubCategory[] listOfSubCatHome = {new SubCategory("bedsheets"),
										new SubCategory("blankets"), 
										new SubCategory("doormats"), 
										new SubCategory("bedCovers")};
		
		SubCategory[] listOfSubCatBeauty = {new SubCategory("mens grooming"),
										new SubCategory("womens grooming"), 
										new SubCategory("skincare"), 
										new SubCategory("makeup")};
		
		List<Category> listOfCategories = new ArrayList<Category>()
		{
			{
				add(new Category("men", listOfSubCatMen));
				add(new Category("women", listOfSubCatWomen));
				add(new Category("kids", listOfSubCatKids));
				add(new Category("home and living", listOfSubCatHome));
				add(new Category("Beauty", listOfSubCatBeauty));
			}	
		};
		
		List<Brand> listOfBrands = new ArrayList<Brand>()
		{
			{
				add(new Brand("HRX","India"));
				add(new Brand("ROADSTER","India"));
				add(new Brand("ALLEN SOLLY","India"));
				add(new Brand("HIGHLANDER","china"));
			    add(new Brand("LEVIS","US"));
				add(new Brand("PUMA","Germany"));
				add(new Brand("WROGN","India"));
				add(new Brand("fabIndia", "India"));
				add(new Brand("DandJ", "UK"));
				add(new Brand("bombay shaving company","India")); 
				
			}	
				
		};
		
		List<Product> ListOfProducts = new ArrayList<Product>()
			{
			   {
					add(new Product("rapidry tshirt", "black", "l", "male", 500, listOfBrands.get(0), listOfCategories.get(0), listOfSubCatMen[0]));
					add(new Product("casual shirt", "red", "s", "male", 800, listOfBrands.get(1), listOfCategories.get(0), listOfSubCatMen[1]));
					add(new Product("formal pant", "grey", "xl", "male", 1600, listOfBrands.get(2), listOfCategories.get(0), listOfSubCatMen[2]));
					add(new Product("jacket", "blue", "l", "male", 1200, listOfBrands.get(4), listOfCategories.get(0), listOfSubCatMen[3]));
					add(new Product("royalenfield edition shirt", "black", "m", "male", 700, listOfBrands.get(5), listOfCategories.get(0), listOfSubCatMen[1]));
					
					add(new Product("ethenic salwar", "red", "s", "female", 400, listOfBrands.get(1), listOfCategories.get(1), listOfSubCatWomen[0]));
					add(new Product("churidar suit", "green", "xl", "female", 1000, listOfBrands.get(2), listOfCategories.get(1), listOfSubCatWomen[1]));
					add(new Product("saree", "blue", "m", "female", 1500, listOfBrands.get(3), listOfCategories.get(1), listOfSubCatWomen[2]));
					add(new Product("lehenga", "white", "l", "female", 900, listOfBrands.get(6), listOfCategories.get(1), listOfSubCatWomen[3]));
					
					add(new Product("comfy trousers", "red", "l", "female", 1100, listOfBrands.get(1), listOfCategories.get(2), listOfSubCatKids[0]));
					add(new Product("blazer suit", "black", "s", "male", 600, listOfBrands.get(3), listOfCategories.get(2), listOfSubCatKids[1]));
					add(new Product("cotton pants", "skyblue", "xs", "female", 400, listOfBrands.get(4), listOfCategories.get(2), listOfSubCatKids[2]));
					add(new Product("threefourths", "pink", "m", "male", 900, listOfBrands.get(5), listOfCategories.get(2), listOfSubCatKids[3]));
					
					add(new Product("soft covers", "violet", "xxl", "", 2000, listOfBrands.get(8), listOfCategories.get(3), listOfSubCatHome[3]));
					
					add(new Product("shaving cream", "violet", "xxl", "", 2000, listOfBrands.get(9), listOfCategories.get(4), listOfSubCatHome[3]));
					
			   }	
			};
		
		
		Deal festivedeals = new Deal();
		
		festivedeals.addproduct(ListOfProducts.get(0));
		festivedeals.addproduct(ListOfProducts.get(5));
		festivedeals.addproduct(ListOfProducts.get(10));
		festivedeals.addproduct(ListOfProducts.get(13));
		festivedeals.addproduct(ListOfProducts.get(14));
		
		
		
		Deal diwalideals = new Deal();
		
		diwalideals.addproduct(ListOfProducts.get(2));
		diwalideals.addproduct(ListOfProducts.get(6));
		diwalideals.addproduct(ListOfProducts.get(11));
		diwalideals.addproduct(ListOfProducts.get(3));
		diwalideals.addproduct(ListOfProducts.get(12));
		
		
		List<Deal> listOfDeals = new ArrayList<Deal>() {
			{
				add(festivedeals);
				add(diwalideals);
			}
		};
		
		
		
		MyntraConsole myntraapp = new MyntraConsole(listOfCategories, listOfBrands, listOfDeals, ListOfProducts);
		
		myntraapp.searchCategory("kids");
		
		
		myntraapp.filtersearch(400, 800);
		
		
		myntraapp.filtersearch("l", "black", "male", listOfBrands.get(0), 400, 1000);
		
		
		myntraapp.searchProduct("rapidry tshirt");
		
		
		myntraapp.addToWishlist(ListOfProducts.get(1));
		myntraapp.addToWishlist(ListOfProducts.get(10));
		myntraapp.addToWishlist(ListOfProducts.get(13));
		myntraapp.DisplayWishlist();
		myntraapp.deleteformWishlist(ListOfProducts.get(1));
		myntraapp.DisplayWishlist();
		
		
		myntraapp.addtocart(ListOfProducts.get(4));
		myntraapp.addtocart(ListOfProducts.get(5));
		myntraapp.addtocart(ListOfProducts.get(6));
		myntraapp.showcart();
		myntraapp.deleteformCart(ListOfProducts.get(4));
		myntraapp.showcart();
		
		
		myntraapp.showdeals();
		
	}
	
	
	
	
	

}

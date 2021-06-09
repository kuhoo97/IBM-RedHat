package comm.example;

public class Product {
	
	private String productId;
	private String productName;
	private static Double productPrice;
	private static Integer numberOfProduct;
	public static Double discountPrice ; 
	
	static
	{
		numberOfProduct=0;
		productPrice =0.0;
		discountPrice = 0.0;
	}
	
	public  void  createProduct(String id, String name, Double price) {
		numberOfProduct++;
		productId = id;
		productName = name;
		productPrice = price;
	}
	
	
	public static Integer getNumberOfProduct()
	{
		return numberOfProduct;
	}

	public static Double getProductPrice()
	{
		return numberOfProduct* productPrice ;
	}

	
	public static double discount(double discountpercentage)
	{
		System.out.println("Discount applicable for "+getNumberOfProduct()+ " number of product(s) is:  ") ;
		if(discountpercentage==0)
		{
			discountPrice=  getProductPrice();
			return discountPrice;
		}
		else {
			
			discountPrice= (getProductPrice()* discountpercentage/100);
			return discountPrice;
		}
		
	}
	
	public double total()
	{
		return  getProductPrice()- discountPrice;
	}

	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
	
	
	
}

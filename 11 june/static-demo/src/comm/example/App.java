package comm.example;

import java.util.UUID;

public class App {

	public static void main(String[] args) {
		
	Product product=new Product();
	product.createProduct(UUID.randomUUID().toString(), "Cell Phone", 2000.0);
	// System.out.println(Product.getNumberOfProduct());
	System.out.println(product.discount(10));
	System.out.println("Initial Product price is: "+Product.getProductPrice());
	System.out.println("Total price after discount is: "+product.total());
	System.out.println();
	
	
	Product product1=new Product();
	product1.createProduct(UUID.randomUUID().toString(), "Laptop", 2000.0);
	// System.out.println(Product.getNumberOfProduct());
	System.out.println(product1.discount(20));
	System.out.println("Initial Product price is: "+Product.getProductPrice());
	System.out.println("Total price after discount is: "+product1.total());
	System.out.println();
	
	
	Product product2=new Product();
	product2.createProduct(UUID.randomUUID().toString(), "Mobile", 2000.0);
	// System.out.println(Product.getNumberOfProduct());
	System.out.println(product1.discount(30));
	System.out.println("Initial Product price is: "+Product.getProductPrice());
	System.out.println("Total price after discount is: "+product2.total());
	System.out.println();
	
	Product product3=new Product();
	product3.createProduct(UUID.randomUUID().toString(), "Phone", 2000.0);
	// System.out.println(Product.getNumberOfProduct());
	System.out.println(product1.discount(40));
	System.out.println("Initial Product price is: "+Product.getProductPrice());
	System.out.println("Total price after discount is: "+product3.total());
	System.out.println();	

	}

}
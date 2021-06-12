package org.example;

public class Beer {
	private String beerId;
	private String beerName;
	private double price;
	public Beer() {
		super();
	}
	public Beer(String beerId, String beerName, double price) {
		super();
		this.beerId = beerId;
		this.beerName = beerName;
		this.price = price;
	}
	protected String getBeerId() {
		return beerId;
	}
	protected void setBeerId(String beerId) {
		this.beerId = beerId;
	}
	protected String getBeerName() {
		return beerName;
	}
	protected void setBeerName(String beerName) {
		this.beerName = beerName;
	}
	protected double getPrice() {
		return price;
	}
	protected void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Beer [beerId=" + beerId + ", beerName=" + beerName + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Beer beer=null;
		if(obj instanceof Beer)
		{
			beer=(Beer)obj;
		}
		if((this.beerName== beer.beerName)&&(this.price==beer.price))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
}

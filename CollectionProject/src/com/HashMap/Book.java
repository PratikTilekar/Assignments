package com.HashMap;

public class Book 
{
	private int id;
	private String bName;
	private int price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String bName, int price) {
		super();
		this.id = id;
		this.bName = bName;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bName=" + bName + ", price=" + price + "]";
	}
	
	
	
	

}

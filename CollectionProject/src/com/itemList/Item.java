package com.itemList;

public class Item implements Comparable<Item>
{
	int id;
	String name;
	float price;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Item o) {
		if(this.id < o.id )
			return -1;
		else
			if(this.id > o.id)
				return 1;
			else
		          return 0;
	}
	
	

}

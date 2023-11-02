package com.sqlJoin.dto;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class OrderResponse {
	private String name;
	private String productname;
	private int price;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public OrderResponse(String name, String productname) {
		super();
		this.name = name;
		this.productname = productname;
	}
	public OrderResponse(String name, String productname, int price) {
		super();
		this.name = name;
		this.productname = productname;
		this.price = price;
	}
	
	



}

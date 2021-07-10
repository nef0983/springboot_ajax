package com.main.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StockTable {

	@Id
	@GeneratedValue
	Long id;

	private String date;

	private String stockname;

	private int stocknum;
	
	private double price;

	private String doing;

	private double quantity;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStockname() {
		return stockname;
	}

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public int getStocknum() {
		return stocknum;
	}

	public void setStocknum(int stocknum) {
		this.stocknum = stocknum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDoing() {
		return doing;
	}

	public void setDoing(String doing) {
		this.doing = doing;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "<br> " + date +" "+  stockname +"_"+  stocknum+"  "
				+  price +"  "+ doing+"  " + quantity+"  " +"<br>";
	}
	
	
}

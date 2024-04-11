package com.code;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	
	private String name;
	
	private String orderMenu;

	public Customer() {
		super();
	}

	public Customer(int cid, String name, String orderMenu) {
		super();
		this.cid = cid;
		this.name = name;
		this.orderMenu = orderMenu;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrderMenu() {
		return orderMenu;
	}

	public void setOrderMenu(String orderMenu) {
		this.orderMenu = orderMenu;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", orderMenu=" + orderMenu + "]";
	}
	
	

}

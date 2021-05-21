package com.cognizant.truyum.model;

import java.util.Date;

public class MenuItem {
	private long id;
	private String name;
	private float price;
	private boolean active;
	private Date dateoflaunch;
	private String category;
	private boolean freedelivery;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateoflaunch() {
		return dateoflaunch;
	}

	public void setDateoflaunch(Date dateoflaunch) {
		this.dateoflaunch = dateoflaunch;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isFreedelivery() {
		return freedelivery;
	}

	public void setFreedelivery(boolean freedelivery) {
		this.freedelivery = freedelivery;
	}

	public MenuItem(long id, String name, float price, boolean active, Date dateoflaunch, String category,
			boolean freedelivery) {

		this.id = id;
		this.name = name;
		this.price = price;
		this.active = active;
		this.dateoflaunch = dateoflaunch;
		this.category = category;
		this.freedelivery = freedelivery;
	}
	public MenuItem(long id2, String name2, String string, float f, boolean b, boolean c, Date convertToDate) {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return id+" "+price+" "+active+" "+dateoflaunch+" "+category+" "+freedelivery;
	}
	
}

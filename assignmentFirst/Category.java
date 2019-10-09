package com.yesh.assignmentFirst;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Category {
	private int id;
	private String name;
	private Date date;

	private SimpleDateFormat dateformat = new SimpleDateFormat();

	public String showCategoryDetail() {

		return "id: " + getId() + " " + "name: " + getName() + " " + "date: " + getStringCreateDate();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public String getStringCreateDate() {
		return dateformat.format(this.date);
	}

	public void setDate(Date date2) {
		this.date = date2;
	}

}

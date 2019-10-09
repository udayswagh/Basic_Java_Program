package com.yesh.assignmentFirst;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Section {

	private int id;
	private String name;
	private Date date;
	private SimpleDateFormat dateformat = new SimpleDateFormat();

	public String showSectionDetail() {

		return "id: " + getId() + " " + "name: " + getName() + " " + "date: " + getStringCreateDate();

	}

	public int getId() {
		return id;
	}

	public int setId(int id) {
		return this.id = id;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public Date getdate() {
		return date;
	}

	public String getStringCreateDate() {
		return dateformat.format(this.date);
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

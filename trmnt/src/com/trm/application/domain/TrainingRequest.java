package com.trm.application.domain;

import java.util.Date;

/**
 * This TrainingRequest component used has a data traveler between layers.
 * 
 * @author uday
 *
 */
public class TrainingRequest {

	public TrainingRequest() {
		TrainingRequest[] trainingRequest = new TrainingRequest[10];

	}

	/**
	 * This is id of TrainingRequest
	 */
	private long id;

	/**
	 * This is name of TrainingRequest
	 */

	private String name;
	/**
	 * This is title of TrainingRequest
	 */

	private String titile;

	/**
	 * This is description of TrainingRequest should not be more then 200 words.
	 */

	private String description;;
	/**
	 * This is start_date of Training
	 */

	private Date start_date;
	/**
	 * This is end_date of Training
	 */
	private Date end_date;

	public long getId() {
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

	public String getTitile() {
		return titile;
	}

	public void setTitile(String titile) {
		this.titile = titile;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date date) {
		this.start_date = date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date date) {
		this.end_date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

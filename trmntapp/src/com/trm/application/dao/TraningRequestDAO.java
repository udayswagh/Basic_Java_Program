package com.trm.application.dao;

import java.util.List;

import com.trm.application.domain.TrainingRequest;

/**
 * This TraningRequestDao interface show the CRUD operation on TraningRequest
 * 
 * @author uday
 *
 */

public interface TraningRequestDAO {

	/**
	 * save() method is used to save the TraningRequest from local repository
	 *
	 */
	public TrainingRequest[] save(TrainingRequest[] trainingRequest);

	/**
	 * delete() method is used to save the TraningRequest from local repository
	 *
	 */

	public List<TrainingRequest> delete(TrainingRequest traningRequest);

	/**
	 * update() method is used to save the TraningRequest from local repository
	 *
	 */
	public void update(TrainingRequest traningRequest);

}

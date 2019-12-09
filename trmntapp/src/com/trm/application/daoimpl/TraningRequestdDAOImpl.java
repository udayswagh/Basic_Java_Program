package com.trm.application.daoimpl;

import java.util.Date;
import java.util.List;

import com.trm.application.dao.TraningRequestDAO;
import com.trm.application.domain.TrainingRequest;

/**
 * This is a implementation of TrainingRequest
 * 
 * @author uday
 *
 */
public class TraningRequestdDAOImpl implements TraningRequestDAO {

	//TrainingRequest trainingRequest;
	TrainingRequest trainingRequest;
	@Override
	public TrainingRequest[] save(TrainingRequest[] training) {

		trainingRequest = new TrainingRequest();
		trainingRequest.setId(101);
		trainingRequest.setName("uday");
		trainingRequest.setDescription("java training");
		trainingRequest.setTitile("java");
		trainingRequest.setStart_date(new Date());
		trainingRequest.setEnd_date(new Date());

		System.out.println("Date saved");

		return training;
	}

	

	@Override
	public void update(TrainingRequest traningRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<TrainingRequest> delete(TrainingRequest traningRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.trm.application.serviceimpl;

import com.trm.application.daoimpl.TraningRequestdDAOImpl;
import com.trm.application.domain.TrainingRequest;
import com.trm.application.service.TrainingRequestService;

public class TrainingRequestServiceImpl implements TrainingRequestService {

	TrainingRequest[] trainer;
	TraningRequestdDAOImpl trainingRequestDAOimpl = new TraningRequestdDAOImpl();

	@Override
	public void saveRequest() {

		trainingRequestDAOimpl.save(trainer);

	}

	@Override
	public TrainingRequest[] listRequest() {
		// TODO Auto-generated method stub
		return null;
	}

}

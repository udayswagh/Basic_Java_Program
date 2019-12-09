package com.trm.application.main;

import com.trm.application.dao.TraningRequestDAO;
import com.trm.application.daoimpl.TraningRequestdDAOImpl;
import com.trm.application.domain.TrainingRequest;
import com.trm.application.service.TrainingRequestService;
import com.trm.application.serviceimpl.TrainingRequestServiceImpl;

public class ApplicationRun {
	public static void main(String[] args) {
		
		TrainingRequest[] trainer;

		TrainingRequestService trainingRequestService=new TrainingRequestServiceImpl();
		trainingRequestService.saveRequest();
		System.out.println("successfull");
	}
}

package com.trm.application.service;

import com.trm.application.domain.TrainingRequest;

public interface TrainingRequestService {
	public void saveRequest();

	public TrainingRequest[] listRequest();
}

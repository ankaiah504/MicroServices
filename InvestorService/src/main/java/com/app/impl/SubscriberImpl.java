package com.app.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.SubscriberRegistration;
import com.app.repository.SubscriberRegistrationRepo;
import com.app.service.SubscriberService;

@Service
public class SubscriberImpl implements SubscriberService{

	@Autowired
	private SubscriberRegistrationRepo repo;
	@Override
	public SubscriberRegistration saveRegistration(SubscriberRegistration reg) {
		SubscriberRegistration	prod=repo.save(reg);
		return prod;
	}

}

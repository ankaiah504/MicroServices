package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.SubscriberRegistration;
import com.app.impl.SubscriberImpl;

@RequestMapping("api/subscriber")
@RestController
public class SubscriberController {

	@Autowired
	private SubscriberImpl repo;
	
	@RequestMapping(value="registration",method = RequestMethod.POST)
	public ResponseEntity<?>  saveRegistration(@RequestBody SubscriberRegistration sub){
		
		SubscriberRegistration reg =repo.saveRegistration(sub);
		return new ResponseEntity<>(reg, HttpStatus.OK);  
		
	} 

	
}

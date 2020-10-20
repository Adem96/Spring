package com.candidate.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CandidatRestAPI {

	private String title = "Hello, I'm the candidate Microservice";
	@Autowired
	//private CandidatService candidatService;
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println(title);
		return title;
}
}
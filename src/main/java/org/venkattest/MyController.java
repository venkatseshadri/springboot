package org.venkattest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.venkattest.model.Employee;

@RestController
@RequestMapping("/myApp")
public class MyController {
	
	@Autowired
	Employee _employee;
	
	@RequestMapping("/hello")
	public String myResponse() {
		return "Hello World";
	}

	@RequestMapping("/util")
	public Employee myUtilResponse() {
		return _employee;
	}
	
}

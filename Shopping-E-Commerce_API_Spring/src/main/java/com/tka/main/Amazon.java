package com.tka.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Amazon")
public class Amazon {
	
	
	@RequestMapping(value="/Product_Details",method=RequestMethod.GET)
	public String Product_Details() {
		return"Welcome to Amazon shopping Services";
		
	}
	
	@RequestMapping(value="/Financial_Services",method=RequestMethod.POST)
	public String Financial_Services() {
		return"Welcome to Amazon  Payment & Financial Services";
		
	}
	@RequestMapping(value="/Delivery",method=RequestMethod.PUT)
	public String  Delivery() {
		return "Welcome  to Amazon Delivery & Logistics";
		
	}
	@RequestMapping(value="/Membership",method=RequestMethod.DELETE)
	public String  Membership_Services() {
		return "Welcome to Amazon Plus & Membership Services";
	}
	

}

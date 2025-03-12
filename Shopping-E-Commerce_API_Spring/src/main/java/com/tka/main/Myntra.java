package com.tka.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Myntra")
public class Myntra {
	@RequestMapping(value="/Product_Details",method=RequestMethod.GET)
	public String Product_Details() {
		return"Welcome to Myntra shopping Services";
		
	}
	
	@RequestMapping(value="/Financial_Services",method=RequestMethod.POST)
	public String Financial_Services() {
		return"Welcome to Myntra  Payment & Financial Services";
		
	}
	@RequestMapping(value="/Delivery",method=RequestMethod.PUT)
	public String  Delivery() {
		return "Welcome  to Myntra Delivery & Logistics";
		
	}
	@RequestMapping(value="/Membership",method=RequestMethod.DELETE)
	public String  Membership_Services() {
		return "Welcome to Myntra Plus & Membership Services";
	}
	
	

}

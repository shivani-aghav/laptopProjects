package com.paytm.paytmintegration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/")
	public String homePage() {
		System.out.println("Request for home page");
		return "home";
	}
	
	@RequestMapping("/about")
	public String aboutPage() {
		System.out.println("Request for home page");
		return "about";
	}
}

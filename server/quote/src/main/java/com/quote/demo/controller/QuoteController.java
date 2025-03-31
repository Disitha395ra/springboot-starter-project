package com.quote.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class QuoteController {
	
	private final List<String> quotes = List.of(
			"Stay positive and work hard!",
	        "Believe in yourself.",
	        "Code, learn, repeat.",
	        "Small steps lead to big success!"
	);
			

}

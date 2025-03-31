package com.quote.demo.controller;

import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quote.demo.model.QuoteResponse;

@RestController
@RequestMapping("/app")
public class QuoteController {
	
	private final List<String> quotes = List.of(
			"Stay positive and work hard!",
	        "Believe in yourself.",
	        "Code, learn, repeat.",
	        "Small steps lead to big success!"
	);
	@GetMapping("/quote")
	public QuoteResponse getQuote() {
		Random random = new Random();
		String randomQuote = quotes.get(random.nextInt(quotes.size()));
		return new QuoteResponse(randomQuote);
	}
			

}

package com.quote.demo.model;

public class QuoteResponse {
	private String quote;
	
	public QuoteResponse(String quote) {
		this.quote = quote;
	}
	
	public String getQuote() {
		return quote;
	}
	
	public void setQuote(String quote) {
		this.quote = quote;
	}
}

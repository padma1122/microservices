package com.microservices.CurrencyExchangeService;

import java.math.BigDecimal;

public class ExchangeValue {
	private String from;
	private String to;
	private long id;
	private BigDecimal conversionMultiple;
	private int port;
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public ExchangeValue()
	{
		
	}
	public ExchangeValue(long id,String from, String to, 
			BigDecimal conversionMultiple) {
		super();
		this.from = from;
		this.to = to;
		this.id = id;
		this.conversionMultiple = conversionMultiple;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	

}
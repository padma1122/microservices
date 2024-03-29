package com.microservices.CurrencyExchangeService;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	@Autowired
	Environment environment;
	@GetMapping("/Currency-Exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from,@PathVariable String to)
	{
		 ExchangeValue exchangeValue=new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
		 //exchangeValue.setPort(8000);
		 exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		 return exchangeValue;
	 }

}
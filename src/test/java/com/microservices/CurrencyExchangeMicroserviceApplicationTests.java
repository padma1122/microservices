package com.microservices;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.microservices.CurrencyExchangeService.CurrencyExchangeMicroserviceApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CurrencyExchangeMicroserviceApplication.class)
public class CurrencyExchangeMicroserviceApplicationTests {

	@Test
	public void contextLoads() {
	}

}

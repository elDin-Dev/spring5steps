package com.sandin.learning.spring.basics.spring5steps;

import com.sandin.learning.spring.basics.spring5steps.cdi.SomeCDIBusiness;
import com.sandin.learning.spring.basics.spring5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5stepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring5stepsCdiApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Spring5stepsCdiApplication.class, args);

		SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);
		LOGGER.info("{}",someCDIBusiness.getSomeCdiDao());

	}

}

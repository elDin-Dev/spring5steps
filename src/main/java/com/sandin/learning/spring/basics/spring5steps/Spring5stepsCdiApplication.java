package com.sandin.learning.spring.basics.spring5steps;

import com.sandin.learning.spring.basics.spring5steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sandin.learning.spring.basics.spring5steps")
public class Spring5stepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring5stepsCdiApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(Spring5stepsCdiApplication.class);

		SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);
		LOGGER.info("********************{}",someCDIBusiness.getSomeCdiDao());

	}

}

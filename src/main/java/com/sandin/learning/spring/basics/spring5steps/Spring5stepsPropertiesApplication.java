package com.sandin.learning.spring.basics.spring5steps;

import com.sandin.learning.spring.basics.spring5steps.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan
public class Spring5stepsPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring5stepsPropertiesApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext =
					new AnnotationConfigApplicationContext(Spring5stepsPropertiesApplication.class)){

			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);


			LOGGER.info(" >>>>>>>>>>>>  Service URl:{}",someExternalService.returnServiceURL());

		}


	}

}

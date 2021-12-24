package com.sandin.learning.spring.basics.spring5steps;

import com.sandin.learning.spring.basics.Component.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sandin.learning.spring.basics.Component")
public class Spring5stepsComponentApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring5stepsComponentApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext =
			new AnnotationConfigApplicationContext(Spring5stepsComponentApplication.class);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("------------------------>{}",componentDAO);


	}

}

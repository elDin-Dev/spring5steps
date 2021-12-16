package com.sandin.learning.spring.basics.spring5steps;

import com.sandin.learning.spring.basics.Component.ComponentDAO;
import com.sandin.learning.spring.basics.spring5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sandin.learning.spring.basics.Component")
public class Spring5stepsComponentApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring5stepsComponentApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Spring5stepsComponentApplication.class, args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("------------------------>{}",componentDAO);


	}

}

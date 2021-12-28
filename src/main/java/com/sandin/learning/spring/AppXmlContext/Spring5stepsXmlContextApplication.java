package com.sandin.learning.spring.AppXmlContext;
import com.sandin.learning.spring.basics.spring5steps.Spring5stepsCdiApplication;
import com.sandin.learning.spring.basics.spring5steps.basic.BinarySearchImpl;
import com.sandin.learning.spring.basics.spring5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class Spring5stepsXmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(Spring5stepsXmlContextApplication.class);

	public static void main(String[] args) {


		try (ClassPathXmlApplicationContext applicationContext =
					 new ClassPathXmlApplicationContext("applicationContext.xml")){

			XmlPersonDAO XmlPersonDAO = applicationContext.getBean(com.sandin.learning.spring.basics.spring5steps.xml.XmlPersonDAO.class);

			LOGGER.info("bean--->>>>>>:{}",XmlPersonDAO);

		}
	}

}

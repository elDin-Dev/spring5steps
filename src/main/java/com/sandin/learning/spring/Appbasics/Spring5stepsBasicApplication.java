package com.sandin.learning.spring.Appbasics;
import com.sandin.learning.spring.basics.spring5steps.basic.BinarySearchImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sandin.learning.spring.basics.spring5steps.basic")
public class Spring5stepsBasicApplication {

	public static void main(String[] args) {


		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(Spring5stepsBasicApplication.class);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println("bean 1:"+binarySearch);
		System.out.println("bean 2:"+binarySearch1);

		int result= binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

		System.out.println(result);

	}

}

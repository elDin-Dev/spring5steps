package com.sandin.learning.spring.basics.spring5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5stepsApplication {

	public static void main(String[] args) {


		ApplicationContext applicationContext = SpringApplication.run(Spring5stepsApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println("bean 1:"+binarySearch);
		System.out.println("bean 2:"+binarySearch1);

		int result= binarySearch.binarySearch(new int[] {12, 4, 6}, 3);

		System.out.println(result);

	}

}

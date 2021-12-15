package com.sandin.learning.spring.basics.spring5steps;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {


    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;


    public int binarySearch(int[] numbers, int numbersToSearchFor){

        System.out.println("SortAlgorithmType:"+this.sortAlgorithm);
        int[] sortedNumbers= sortAlgorithm.sort(numbers);

        return 3;
    }

}


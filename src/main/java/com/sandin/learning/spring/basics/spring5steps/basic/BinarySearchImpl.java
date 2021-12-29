package com.sandin.learning.spring.basics.spring5steps.basic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {


    public static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;


    public int binarySearch(int[] numbers, int numbersToSearchFor){

        System.out.println("SortAlgorithmType:"+this.sortAlgorithm);
        int[] sortedNumbers= sortAlgorithm.sort(numbers);

        return 3;
    }

    @PostConstruct
    public void postConstruct(){
        LOGGER.info("{}","PostConstruct:",this);
    }

    @PreDestroy
    public void preDestroy(){
        LOGGER.info("{}","PreDestroy:",this);
    }


}


package com.sandin.learning.spring.basics.spring5steps;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {


    @Autowired
    private SortAlgorithm bubbleSortAlgorithm;


    public int binarySearch(int[] numbers, int numbersToSearchFor){

        System.out.println("SortAlgorithmType:"+this.bubbleSortAlgorithm);
        int[] sortedNumbers= bubbleSortAlgorithm.sort(numbers);

        return 3;
    }

}


package com.sandin.learning.spring.basics.spring5steps;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {


    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numbersToSearchFor){

        System.out.println(this.sortAlgorithm);
        int[] sortedNumbers= sortAlgorithm.sort(numbers);

        return 3;
    }

}

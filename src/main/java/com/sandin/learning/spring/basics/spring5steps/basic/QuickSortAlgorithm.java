package com.sandin.learning.spring.basics.spring5steps.basic;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{


    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}

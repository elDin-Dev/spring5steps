package com.sandin.learning.spring.basics.spring5steps;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{


    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}

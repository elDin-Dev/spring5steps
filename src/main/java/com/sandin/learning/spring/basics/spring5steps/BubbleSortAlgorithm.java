package com.sandin.learning.spring.basics.spring5steps;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {


    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}

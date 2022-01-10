package com.sandin.learning.spring.basics.spring5steps.basic;


import com.sandin.learning.spring.Appbasics.Spring5stepsBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Spring5stepsBasicApplication.class)
public class BinarySearchImplTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void test(){

        int result=binarySearch.binarySearch(new int[]{},5);
        assertEquals(3, result);

    }
}
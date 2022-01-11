package com.sandin.learning.spring.basics.spring5steps.cdi;


import com.sandin.learning.spring.Appbasics.Spring5stepsBasicApplication;
import com.sandin.learning.spring.basics.spring5steps.Spring5stepsCdiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Spring5stepsCdiApplication.class)
public class SomeCDIBusinessTest  {



    @Autowired
    SomeCDIBusiness business;

    @Test
    public void testBasicScenario(){

        int actualResult = business.findGreatest();
        assertEquals(100, actualResult);

    }

}
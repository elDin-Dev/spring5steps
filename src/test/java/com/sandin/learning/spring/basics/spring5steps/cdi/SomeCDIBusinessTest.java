package com.sandin.learning.spring.basics.spring5steps.cdi;


import com.sandin.learning.spring.Appbasics.Spring5stepsBasicApplication;
import com.sandin.learning.spring.basics.spring5steps.Spring5stepsCdiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SomeCDIBusinessTest  {



    @InjectMocks
    SomeCDIBusiness business;

    @Mock
    SomeCdiDao daoMock;

    @Test
    public void testBasicScenario(){

        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4});
        int actualResult = business.findGreatest();
        assertEquals(4, actualResult);

    }

    @Test
    public void testBasicScenario_no_elements(){

        Mockito.when(daoMock.getData()).thenReturn(new int[]{});
        int actualResult = business.findGreatest();
        assertEquals(Integer.MIN_VALUE, actualResult);

    }


}
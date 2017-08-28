package com.db.junit_example;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class TaxCalculatorTest {

    @Test
    public void withNDS() throws Exception {


        NDSResolver mockNDSResolver = new NDSResolver(){
            @Override
            public double getNDS() {
                return 0.1;
            }
        };
/*
        NDSResolver mockNDSResolver2 = Mockito.mock(NDSResolver.class);
        when(mockNDSResolver2.getNDS().thenReturn(0.1));

        TaxCalculator taxCalculator = new TaxCalculator(mockNDSResolver);

        double withNDS = taxCalculator.withNDS(100);
        Assert.assertEquals(118, withNDS, 0.00000001);*/
    }

}
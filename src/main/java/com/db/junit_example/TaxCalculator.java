package com.db.junit_example;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static lombok.AccessLevel.PACKAGE;


public class TaxCalculator {
   /* @AllArgsConstructor(access = PACKAGE)
    @NoArgsConstructor*/
    private NDSResolver ndsResolver =  new NDSResolverImpl();


    public double withNDS(double price){
        double nds = ndsResolver.getNDS();
        return price *(1 + nds);
    }
}

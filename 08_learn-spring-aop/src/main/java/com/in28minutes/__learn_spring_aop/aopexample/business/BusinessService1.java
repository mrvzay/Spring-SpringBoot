package com.in28minutes.__learn_spring_aop.aopexample.business;

import com.in28minutes.__learn_spring_aop.aopexample.data.DataService1;

import java.util.Arrays;

public class BusinessService1 {

    private DataService1 dataService1;

    public int calculateMax() {
        int[] data = dataService1.retrieveData();
        return Arrays.stream(data).max().orElse(0);
    }
}

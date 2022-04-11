package com.fileHandling;

import java.io.Serializable;

public class Car implements Serializable {

    private static final long seriaLVersionUID=1L;

    int weight , height ;
    String model;



    public Car(int weight , int height , String model) {
        this.weight=weight;
        this.height=height;
        this.model= model;
    }




}

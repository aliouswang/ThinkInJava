package com.alious.thinkinjava.ch14;

/**
 * Created by aliouswang on 16/9/20.
 */

public class GenericClassReferences {

    public static void main(String[] args) {
        Class<?> intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
//        genericIntClass = double.class;
    }

}

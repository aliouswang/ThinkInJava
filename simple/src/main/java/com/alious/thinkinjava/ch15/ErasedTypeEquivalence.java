package com.alious.thinkinjava.ch15;

import java.util.ArrayList;

/**
 * Created by aliouswang on 16/9/26.
 */

public class ErasedTypeEquivalence {

    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();

        System.out.println(c1 == c2);

        System.out.println(c1.getCanonicalName());
    }

}

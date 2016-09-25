package com.alious.thinkinjava.ch15;

/**
 * Created by aliouswang on 16/9/25.
 */

public class Coffee {

    private static long counter = 0;
    private final long id = counter ++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }

}

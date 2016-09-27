package com.alious.thinkinjava.ch15;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by aliouswang on 16/9/27.
 */

public class ArrayMaker{

    private Class kind;
    public ArrayMaker(Class kind) {
        this.kind = kind;
    }

    Object[] create(int size) {
        return (Object[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker stringMaker = new ArrayMaker(String.class);
        String[] strings = (String[]) stringMaker.create(5);
        System.out.println(Arrays.toString(strings));
    }
}

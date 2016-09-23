package com.alious.thinkinjava.ch15;

/**
 * Created by aliouswang on 16/9/23.
 */

public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {

    private C c;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }
}

package com.alious.thinkinjava.ch15;

/**
 * Created by aliouswang on 16/9/27.
 */

public class ReturnGenericType<T extends HasF> {

    private T t;

    public T get() {
        return t;
    }

    public void f() {
        t.f();
    }

}

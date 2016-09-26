package com.alious.thinkinjava.ch15;

/**
 * Created by aliouswang on 16/9/26.
 */

public class GenericMethod {

    public <T , W, H> void f(T t, W w, H h) {
        System.out.println(t.getClass().getCanonicalName());
        System.out.println(w.getClass().getCanonicalName());
        System.out.println(h.getClass().getCanonicalName());
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.f(1, 1.0f, new GenericMethod());
//        genericMethod.f("3");
//        genericMethod.f(1.0f);
//        genericMethod.f(1L);
//        genericMethod.f(1.0d);
//        genericMethod.f(new GenericMethod());
    }

}

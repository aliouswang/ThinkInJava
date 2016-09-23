package com.alious.thinkinjava.ch15;

/**
 * Created by aliouswang on 16/9/23.
 */

public class Holder3<T> {

    private T t;

    public Holder3(T a) {
        this.t = a;
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }

    public static void main(String[] args) {
        Holder3<AutoMobile> holder3 = new Holder3<>(
                new AutoMobile()
        );
        holder3.get();
    }


}

package com.alious.thinkinjava.ch15;

/**
 * Created by aliouswang on 16/9/23.
 */

public class Holder2 {

    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public Object get() {
        return this.a;
    }


    public static void main(String[] args) {
        Holder2 h2 = new Holder2(new AutoMobile());
        AutoMobile a = (AutoMobile) h2.get();
        h2.set("Not an autoMobile");
        String s = (String) h2.get();
        h2.set(1);
        Integer x = (Integer) h2.get();
    }


}

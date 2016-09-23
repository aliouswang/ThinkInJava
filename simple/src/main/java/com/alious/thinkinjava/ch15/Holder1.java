package com.alious.thinkinjava.ch15;

/**
 * Created by aliouswang on 16/9/23.
 */

public class Holder1 {

    private AutoMobile a;

    public Holder1(AutoMobile autoMobile) {
        this.a = autoMobile;
    }

    AutoMobile get() {
        return this.a;
    }
}

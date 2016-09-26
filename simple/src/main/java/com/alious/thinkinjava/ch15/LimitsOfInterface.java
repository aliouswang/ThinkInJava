package com.alious.thinkinjava.ch15;

import java.util.Map;

/**
 * Created by aliouswang on 16/9/26.
 */

public class LimitsOfInterface {

    static void f(Map<Coffee, Coffee> coffeeMap) {}

    public static void main(String[] args) {
        f(New.<Coffee, Coffee>map());
    }

}

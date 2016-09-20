package com.alious.thinkinjava.ch14;

import com.alious.thinkinjava.utils.PrintUtils;

import java.util.Random;

/**
 * Created by aliouswang on 16/9/20.
 */

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 =
            ClassInitialization.rand.nextInt(1000);
    static final int staticFinal3 = staticFinal + staticFinal;
    static {
        PrintUtils.print("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        PrintUtils.print("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;
    static {
        PrintUtils.print("Initializing Initable3");
    }
}

public class ClassInitialization {

    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception{
        Class initable = Initable.class;
        PrintUtils.print("After creating Initable ref");
        PrintUtils.print(Initable.staticFinal + "");
        PrintUtils.print(Initable.staticFinal3 + "");
        PrintUtils.print(Initable2.staticNonFinal + "");
        Class init3 = Class.forName(Initable3.class.getCanonicalName());
        PrintUtils.print("After creating Initable3 ref");
        PrintUtils.print(Initable3.staticNonFinal + "");
    }

}

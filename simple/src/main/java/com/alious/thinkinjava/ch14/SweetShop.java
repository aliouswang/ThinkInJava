package com.alious.thinkinjava.ch14;

import com.alious.thinkinjava.utils.PrintUtils;

/**
 * Created by aliouswang on 16/9/20.
 */

class Candy {
    static {
        PrintUtils.print("Loading candy");
    }
}

class Gum {
    static {
        PrintUtils.print("Loading gum");
    }
}

class Cookie {
    static {
        PrintUtils.print("Loading cookie");
    }
}


public class SweetShop {

    public static void main(String[] args) {
        PrintUtils.print("inside main");
        new Candy();
        PrintUtils.print("After creating Candy");
        try {
            Class.forName(Gum.class.getCanonicalName());
//            PrintUtils.print(Gum.class.getCanonicalName());
        }catch (Exception e) {
            PrintUtils.print("Could not find Gum");
        }
        PrintUtils.print("After class.forName(\"Gum\")");
        new Cookie();
        PrintUtils.print("After create cookie");
    }

}

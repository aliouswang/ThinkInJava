package com.alious.thinkinjava.ch14;

import com.alious.thinkinjava.utils.PrintUtils;

/**
 * Created by aliouswang on 16/9/20.
 */

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    Toy() {}
    Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        PrintUtils.print("Class name:" + cc.getName() + " is interface :" + cc.isInterface());
        PrintUtils.print("Simple name:" + cc.getSimpleName());
        PrintUtils.print("Cannonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) throws Exception{
//        Class c = null;
//        try {
//            c = Class.forName("com.alious.thinkinjava.ch14.FancyToy");
//        }catch (ClassNotFoundException e) {
//            PrintUtils.print("COuld not find fancyToy");
//            System.exit(1);
//        }
//        printInfo(c);
//        for (Class face : c.getInterfaces()) {
//            printInfo(face);
//        }
//        Class up = c.getSuperclass();
//        Object obj = null;
//        try {
//            obj = up.newInstance();
//        }catch (InstantiationException e) {
//            PrintUtils.print("Cannot instantiate");
//            System.exit(1);
//        }catch (IllegalAccessException e) {
//            PrintUtils.print("Cannot access");
//            System.exit(1);
//        }
//        printInfo(obj.getClass());

        Class<FancyToy> ftClass = FancyToy.class;
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
//        Class<Toy> up2 = ftClass.getSuperclass();
        Object obj = up.newInstance();
    }

}

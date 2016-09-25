package com.alious.thinkinjava.ch15;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by aliouswang on 16/9/25.
 */

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee>{

    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class,
            Americano.class, Breve.class};

    private static Random rand = new Random(47);
    public CoffeeGenerator() {}

    private int size = 0;
    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee> {

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count --;
            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            gen.next();
        }

        for(Coffee c : new CoffeeGenerator(5)) {
            System.out.println(c);
        }
    }

}

package com.alious.thinkinjava.ch15;

/**
 * Created by aliouswang on 16/9/23.
 */

public class LinkedStack<T> {

    private static class Node<T>{

        T t;
        Node<T> next;

        public Node() {
            t = null;
            next = null;
        }

        public Node(T t, Node<T> next) {
            this.t = t;
            this.next = next;
        }

        public boolean end() {
            return this.t == null && this.next == null;
        }
    }

    private Node<T>  top = new Node<T>();
    public void push(T t) {
        Node<T> newNode = new Node<T>(t, top.next);
        top.next = newNode;
    }

    public T pop() {
        if (top.next != null) {
            T t = top.next.t;
            top.next = top.next.next;
            return t;
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("1");
        stack.push("3");
        stack.push("5");
        String s;
        while ((s = stack.pop()) != null) {
            System.out.println(s);
        }
    }



}

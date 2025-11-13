package com.noah.listen.kompositum;

public class Test {
    public static void main(String[] args) {
        NumberList list = new NumberList();

        list.add(new Node(new Number(1)));
        list.add(new Node(new Number(2)));

        System.out.println("list = " + list);
    }
}

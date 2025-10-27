package com.noah.kompositum;

public class NumberList {
    private ListenElement head;

    public NumberList(){
        head = new Tail();
    }
    public void add(Node node){
        head = node;
    }

    public int getLength(){
        return head.getSize();
    }

    public void addLast(Number number){
        var element = new Node(number);
        head.addLast(number);
    }


}

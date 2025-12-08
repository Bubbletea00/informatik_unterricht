package com.noah.listen.kompositum;

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
        head.addLast(element);
    }


    @Override
    public String toString() {

        //TODO fix dis shit
        StringBuilder sb = new StringBuilder("[");
        ListenElement current = head;
        while (current.getClass() != Tail.class){
            sb.append(head.getData());
            if (head.getFollower().getClass() != Tail.class) sb.append(", ");
            current = head.getFollower();
        }
        sb.append("]");

        return sb.toString();
    }
}

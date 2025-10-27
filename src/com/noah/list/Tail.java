package com.noah.list;

public class Tail extends ListElement {


    public ListElement getFollower() {
        return this;
    }

    @Override
    public Patient getData() {
        return null;
    }

    @Override
    public Node addLast(Patient p) {
        return new Node(p, this);
    }
}

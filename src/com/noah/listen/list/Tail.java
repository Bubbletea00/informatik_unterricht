package com.noah.listen.list;

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

    @Override
    public Patient search(String name) {
        return null;
    }

    @Override
    public ListElement addSorted(Patient p) {
        return null;
    }

    @Override
    public Node removeLast() {
        return null;
    }
}

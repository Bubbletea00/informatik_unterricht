package com.noah.kompositum;

public class Tail implements ListenElement{

    @Override
    public void printData() {

    }

    @Override
    public ListenElement getFollower() {
        return null;
    }

    @Override
    public void setFollower(ListenElement follower) {
        System.err.println("Fuck off");
    }

    @Override
    public ListenElement addLast(ListenElement e) {
        return this;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String getData() {
        return "";
    }
}

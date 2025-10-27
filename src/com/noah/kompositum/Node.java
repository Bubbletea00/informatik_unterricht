package com.noah.kompositum;

public class Node implements ListenElement{
    private ListenElement follower;
    private Number data;

    public Node(Number data){
        this.data = data;
    }

    @Override
    public void printData() {
        data.printData();
    }

    @Override
    public ListenElement getFollower() {
        return follower;
    }

    @Override
    public void setFollower(ListenElement follower) {
        this.follower = follower;
    }

    @Override
    public ListenElement addLast(ListenElement e) {
        return follower.addLast(e);
    }

    @Override
    public int getSize() {
        return 1 + follower.getSize();
    }

    @Override
    public String getData() {
        return String.valueOf(data.getNumber());
    }


}

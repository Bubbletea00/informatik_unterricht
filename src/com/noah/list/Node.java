package com.noah.list;

public class Node extends ListElement{
    private Patient data;

    public Node(Patient data, ListElement follower) {
        super.setFollower(follower);
        this.data = data;
    }



    public Patient getData() {
        return data;
    }

    @Override
    public Node addLast(Patient p) {
        super.setFollower(super.getFollower().addLast(p));
        return this;
    }

    public void setData(Patient data) {
        this.data = data;
    }
}


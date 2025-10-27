package com.noah.list;

public abstract class ListElement {
    private ListElement follower;
    public ListElement(){
        follower = null;
    }
    public ListElement(ListElement follower){
        this.follower = follower;
    }

    public ListElement getFollower() {
        return follower;
    }
    public void setFollower(ListElement follower) {
        this.follower = follower;
    }

    public abstract Patient getData();
    public abstract Node addLast(Patient p);

}

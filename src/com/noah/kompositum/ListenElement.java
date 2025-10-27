package com.noah.kompositum;

public interface ListenElement {
    void printData();

    ListenElement getFollower();
    void setFollower(ListenElement follower);

    ListenElement addLast(ListenElement e);
    int getSize();
}

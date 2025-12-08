package com.noah.listen.kompositum;

public interface ListenElement {
    void printData();

    ListenElement getFollower();
    void setFollower(ListenElement follower);

    ListenElement addLast(ListenElement e);
    int getSize();

    String getData();
}

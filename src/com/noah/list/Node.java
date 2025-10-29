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

    public Patient search(String name){
        if (data.isEqual(name)) return data;
        return getFollower().search(name);
    }

    @Override
    public ListElement addSorted(Patient p) {
        if(isAtSortedPlace(p.getName())) return new Node(p, this);
        return getFollower().addSorted(p);
    }

    @Override
    public Node removeLast() {
        if (getFollower() instanceof Node) return ((Node) getFollower()).removeLast();
        return null; //todo finish
    }

    protected boolean isAtSortedPlace(String name){
        assert this.data != null;
        return this.data.getName().compareTo(name) > 0;
    }
}


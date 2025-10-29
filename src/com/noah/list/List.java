package com.noah.list;

public class List {
    private ListElement head;

    public List(){
        head = new Tail();
    }

    public ListElement getHead() {
        return head;
    }

    public void setHead(ListElement head) {
        this.head = head;
    }

    public Patient removeFirst(){
        Patient data = head.getData();
        head = head.getFollower();
        return data;
    }
    public void addLast(Patient p){
    }

    public Patient search(String name){
        return head.search(name);
    }

    public void deleteList(){
        head = new Tail();
    }

    public void addSorted(Patient p){

    }
}

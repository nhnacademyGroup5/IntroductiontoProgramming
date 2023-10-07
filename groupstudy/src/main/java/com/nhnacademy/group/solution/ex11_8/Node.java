package com.nhnacademy.group.solution.ex11_8;

public class Node {
    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }
}

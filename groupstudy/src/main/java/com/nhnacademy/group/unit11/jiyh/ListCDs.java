package com.nhnacademy.group.unit11.jiyh;

public class ListCDs {

    private CD head;

    ListCDs(){
        head = null;
    }

    public void print(){
        if (head == null) {
            System.out.println("null");
        }

        CD temp = head;
        while (temp != null){
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    public int sum(){
        int sum = 0;
        if (head == null) {
            return sum;
        }

        CD temp = head;
        while (temp != null){
            sum += temp.getPrice();
            temp = temp.getNext();
        }

        return sum;
    }

    public void insert(CD cd){
        if(head == null) {
            head = cd;
            return;
        }

        CD temp = head;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(cd);
    }

    public void delete(CD cd){
        if(head == null) return;
        if(head.getNext() == null) {
            head.setNext(null);
        }

        CD pre = head;
        CD temp = head.getNext();

        while (temp.getNext() != null){
            if(temp.equals(cd)) break;

            pre = pre.getNext();
            temp = temp.getNext();
        }

        pre.setNext(temp.getNext());

    }

}

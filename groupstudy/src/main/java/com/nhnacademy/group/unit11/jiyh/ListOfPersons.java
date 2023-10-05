package com.nhnacademy.group.unit11.jiyh;

public class ListOfPersons {
    private Person head;

    ListOfPersons(){
        head = null;
    }

    public void personPrint(){
        if (head == null) {
            System.out.println("null");
        }

        Person p = head;
        while (p != null){
            System.out.println(p);
            p = p.getNext();
        }

    }

    public int size(){
        if(head == null){
            return 0;
        }

        int count = 1;
        Person p = head;
        while (p.getNext() != null){
            count++;
            p = p.getNext();
        }

        return count;
    }
    public void insertPerson(Person newPerson){

        if(newPerson == null) {
            System.out.println("존재하지않는 객체");
            return;
        }
        if(head == null) {
            head = newPerson;
            return;
        }

        Person list = head;
        while (list.getNext() != null){
            list = list.getNext();
        }
        list.setNext(newPerson);
    }

    public void insertPerson(Person person, Person newPerson){
        if(head == null){
            head = newPerson;
            return;
        }
        if(head.getNext() == null){
            head.setNext(newPerson);
            return;
        }

        Person pre = head;
        Person temp = head.getNext();

        while (pre.getNext() != null){
            if(pre.equals(person)) break;
            pre = pre.getNext();
            temp = temp.getNext();
        }

        pre.setNext(newPerson);
        newPerson.setNext(temp);


    }

    public void deletePerson(){

        if(head == null){
            return;
        }
        if(head.getNext() == null){
            head = null;
            return;
        }

        Person prePerson = head;
        Person tempPerson = head.getNext();

        while (tempPerson.getNext() != null){
            prePerson = tempPerson;
            tempPerson = tempPerson.getNext();
        }

        prePerson.setNext(null);
    }

    public void deletePerson(Person p){
        if(head == null){
            return;
        }

        if(head.getNext() == null){
            head = null;
            return;
        }

        Person prePerson = head;
        Person tempPerson = head.getNext();

        while (tempPerson.getNext() != null){
            if(tempPerson.equals(p)){
                break;
            }
            prePerson = tempPerson;
            tempPerson = tempPerson.getNext();
        }

        prePerson.setNext(tempPerson.getNext());
    }

    public int countresidence(String residence){
        if(head == null) return 1;

        Person p = head;
        int count = 0;

        while (p != null){
            if(p.getResidence().equals(residence)) count++;
            p = p.getNext();
        }

        return count;
    }
}

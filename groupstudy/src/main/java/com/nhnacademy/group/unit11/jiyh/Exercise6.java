package com.nhnacademy.group.unit11.jiyh;

public class Exercise6 {
    public static void main(String[] args) {
        ListCDs list = new ListCDs();

        CD c1 = new CD("a", "programing", 1951, 20000);
        CD c2 = new CD("b", "programing", 1952, 20000);
        CD c3 = new CD("c", "programing", 1953, 20000);
        CD c4 = new CD("d", "programing", 1954, 20000);
        CD c5 = new CD("e", "programing", 1955, 20000);

        list.insert(c1);
        list.insert(c2);
        list.insert(c3);
        list.insert(c4);
        list.insert(c5);
        list.print();

        System.out.println("-------");
        list.delete(c1);
        list.print();

        System.out.println("-----");
        System.out.println("sum : " + list.sum());


    }
}

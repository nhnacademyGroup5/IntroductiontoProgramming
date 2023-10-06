package com.nhnacademy.group.unit11.jinwoo.ex11_1;

public class TestListNode {
    public static void main(String[] args) {
        ListNode a = new ListNode("a");
        a.add("d");
        a.insertBefore("d", "b");
        a.insertBefore("d", "c");
        System.out.println(a);
        System.out.println(a.length());
        a.invert();
        System.out.println(a);
        System.out.println(a.length());
    }
}

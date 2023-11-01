package com.nhnacademy.group.unit11.jiwon;
class ListNode {
    String info;
    ListNode next;

}

public class Exercise11_1 {
    public static void main(String[] args) {

        ListNode a = create();

        System.out.println(length(a));

        insertAfter(a, "X", "B");
        System.out.println("insert after : ");
        printList(a);

        insertBefore(a, "Y", "B");
        System.out.println("insert before :");
        printList(a);

        modify(a, "C", "Y");
        System.out.println("modify :");
        printList(a);

        modifyAll(a, "Y", "W");
        System.out.println("modify all :");
        printList(a);

        ListNode copyList = copy(a);
        System.out.println("Copy of the Original List:");
        printList(copyList);

        ListNode invertedList = invert(a);
        System.out.println("Inverted List:");
        printList(invertedList);


    }

    public static int length(ListNode lis) {
        int count = 0;

        while (lis != null) {
            count++;
            lis = lis.next;
        }

        return count;
    }

    public static ListNode insertAfter(ListNode lis, String s, String given) {
       
        ListNode b = new ListNode();
        while (lis != null) {
            if (lis.info.equals(given)) {
                b.info = s;
                b.next = lis.next;
                lis.next = b;
                break;
            }
            lis = lis.next;
        }
        return b;
    }

    public static ListNode insertBefore(ListNode lis, String s, String given) {
        ListNode p = lis;

        while (lis != null && lis.next != null) {
            if (lis.next.info.equals(given)) {
                ListNode b = new ListNode();
                b.info = s;
                b.next = lis.next;
                lis.next = b;
                break;
            }
            lis = lis.next;
        }
        return p;
    }


    public static ListNode modify(ListNode lis, String old, String ne) {
        ListNode p = lis;
        while (p != null) {
            if (p.info.equals(old)) {
                p.info = ne;
                return lis;
            }
            p = p.next;
        }
        return lis;
    }

    public static ListNode modifyAll(ListNode lis, String old, String ne) {
        ListNode p = lis;
        while (p != null) {
            if (p.info.equals(old)) {
                p.info = ne;
            }
            p = p.next;
        }
        return lis;
    }


    public static ListNode copy(ListNode lis) {
        ListNode a = new ListNode();
        ListNode b = a;
        while (lis != null) {
            b.next = new ListNode();
            b.next.info = lis.info;
            b = b.next;
            lis = lis.next;
        }
        return a.next;
    }

    public static ListNode invert(ListNode lis) {

        ListNode res = null;
        while (lis != null) {
            ListNode q = lis.next;
            lis.next = res;
            res = lis;
            lis = q;
        }
        return res;
    }

    public static void printList(ListNode lis) {
        while (lis != null) {
            System.out.print(lis.info + " ");
            lis = lis.next;
        }
        System.out.println();
    }

    public static ListNode create() {
        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();
        a.info = "A";
        a.next = b;
        b.info = "B";
        b.next = c;
        c.info = "C";
        c.next = null;
        return a;
    }
}
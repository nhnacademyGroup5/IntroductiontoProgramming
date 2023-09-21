package Unit11;

class ListNode {
    String info;
    ListNode next;

}

public class Exercise11_1 {
    public static void main(String[] args) {
        ListNode a = create();
        System.out.println(length(a));

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
        ListNode a = lis;
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
//        if (lis != null && lis.info.equals(given)) {
//            ListNode a = new ListNode();
//            a.info = s;
//            a.next = lis;
//            return a;
//        }
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
//    public static ListNode insertBefore(ListNode lis, String s, String given) {
//        ListNode p = new ListNode();
//        p.next = lis;
//        lis = p;
//        boolean found = false;
//        while ((p.next != null) && !found) {
//            if (p.next.info.equals(given)) {
//                ListNode q = new ListNode();
//                q.info = s;
//                q.next = p.next;
//                p.next = q;
//                found = true;
//            } else {
//                p = p.next;
//            }
//        }
//
//        return lis.next;
//    }


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
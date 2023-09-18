package jinwoo.unit11;

public class TestListNode {
    public static void main(String[] args) {
        ListNode c = new ListNode("C", null);
        ListNode b = new ListNode("B", c);
        ListNode a = new ListNode("A", b);
        ListNode c2 = new ListNode("C", null);
        ListNode b2 = new ListNode("B", c);
        ListNode a2 = new ListNode("A", b);

        // System.out.println(insertAfter(a, "B", "D"));
        // System.out.println(insertBefore(a, "B", "D"));
        // System.out.println(modify(a, "B", "D"));
        // System.out.println(findNode(a, "D"));
        // System.out.println(a);
        // System.out.println(a.invert());
        System.out.println();
    }
}

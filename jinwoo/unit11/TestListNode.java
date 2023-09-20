package jinwoo.unit11;

public class TestListNode {
    public static void main(String[] args) {
        ListNode a = new ListNode("a");
        a.add("d");
        a.insertBefore("d", "b");
        a.insertBefore("d", "c");
        System.out.println(a);
        a.invert();
        System.out.println(a);
    }
}

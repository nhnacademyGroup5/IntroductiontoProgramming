package ch11;

public class StringList {
    
    public static boolean isEmpty(Node node){
        if(node == null) return true;
        return false;
    }

    public static int length(Node node){
        if(isEmpty(node)) return 0;
        return 1 + length(node.next);
    }

    public static void print(Node node){
        if(isEmpty(node)) return;

        System.out.println(node.info);
        print(node.next);
    }

    public static Node insertAfter(Node node, String s, String given){
        if(isEmpty(node)) return new Node(given);

        if(node.info.equals(s)){
            Node n = new Node(given);
            n.next = node.next;
            node.next = n;
            return node;
        }
        node.next = insertAfter(node.next, s, given);
        return node;
    }

    public static Node modify(Node node, String old, String ne){

        if(isEmpty(node)) return node;

        if(node.info.equals(old)) {
            node.info = ne;
            return node;
        }

        node.next = modify(node.next, old, ne);
        return node;
    }

    public static Node modifyAll(Node node, String old, String ne){
        if(isEmpty(node)) return node;

        if(node.info.equals(old)) {
            node.info = ne;
        }

        node.next = modify(node.next, old, ne);
        return node;
    }

    public static Node insertBefore(Node node, String s, String given){
        if(isEmpty(node.next)) {
            node.next = new Node(given);
        }

        if(node.next.info.equals(s)){
            Node n = new Node(given);
            n.next = node.next;
            node.next = n;
            return node;
        }

        node.next = insertBefore(node.next, s, given);
        return node;
    }

    public static Node copy(Node node){

        Node copy = null;

        int len = StringList.length(node);
        for(int i=0; i<len; i++){
            copy = insertAfter(copy, "", node.info);
            node = node.next;
        }

        return copy;
    }

    public static Node invert(Node node){
        Node res = null;
        while (!isEmpty(node)) {
            Node n = node.next;
            node.next = res;
            res = node;
            node = n;
        }

        return res;
    }

    public static Node deleteDoubles(Node node){
        if(isEmpty(node)) return node;

        node.next = null;
        return node;
    }

    public static boolean searchSequence(Node node1, Node node2){

        if(isEmpty(node1) || isEmpty(node2))
            throw new IllegalArgumentException("dfdf");

        String n1 = toString(node1);
        String n2 = toString(node2);

        if(n1.length() > n2.length()) return n1.contains(n2);
        return n2.contains(n1);

    }

    public static String toString(Node node){
        StringBuilder sb = new StringBuilder();
        
        while(!isEmpty(node)){
            sb.append(node.info);
            node = node.next;
        }

        return sb.toString();
    }

}

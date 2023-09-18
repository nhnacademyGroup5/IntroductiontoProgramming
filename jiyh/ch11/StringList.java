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

    public static boolean equals(Node n, String value){
        if(isEmpty(n)) return false;
        return true;
    }


    public static Node insertAfter(Node node, String s, String given){
        if(isEmpty(node)) return new Node(s);

        if(node.info.equals(s)){
            Node n = new Node(given);
            n.next = node.next;
            node.next = n;
        }
        node.next = insertAfter(node.next, s, given);
        return node;
    }



}

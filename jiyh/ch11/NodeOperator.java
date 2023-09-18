package ch11;

import java.io.PrintStream;

public class NodeOperator {
    public static void main(String[] args) {
        Node linked = create();

        linked = insertFirst(linked, "1q2");
        print(linked, System.out);
        linked = insertLast(linked, "insert");
        print(linked, System.out);


    }
    
    public static Node create(){
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();

        n1.info = "1";
        n1.next = n2;
        n2.info = "2";
        n2.next = n3;
        n3.info = "3";
        n3.next = null;


        return n1;
    }

    public static boolean isEmpty(Node node){
        if(node == null) return true;
        return false;
    }

    public static Node insertFirst(Node node, String s) {
        Node p = new Node();
        p.info = s;
        p.next = node;
        node = p;
        return node;
    }
    public static Node insertLast(Node node, String s) {

        if(isEmpty(node)) {
            Node n = new Node();
            n.info = s;
            return n;
        }

        node.next = insertLast(node.next, s);
        return node;
        
    }

    public static Node deleteFirst(Node node) {
        if (isEmpty(node)) node = node.next;
        return node;
    }

    public static void print(Node node, PrintStream ps){
        if(isEmpty(node)) return;

        ps.println(node.info);
        print(node.next, ps);
    }

    public static boolean searchNode(Node node, String value){
        if(isEmpty(node)) return false;

        if(node.info.equals(value)) return true;
        return searchNode(node.next, value);
    }
   
}
